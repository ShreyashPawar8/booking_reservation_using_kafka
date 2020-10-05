package org.example

import java.io.{FileInputStream, InputStream}
import java.time.Duration
import scala.collection.mutable
import java.util
import org.apache.kafka.clients.consumer.KafkaConsumer
import scala.collection.JavaConverters._
import java.util.Properties
import org.apache.logging.log4j.{LogManager, Logger}

object Consumer   {
  def runConsumer(): Unit ={
    //var logger: Logger = LogManager.getLogger ()
    val fixedTable = mutable.HashMap ("GBP:EUR" -> "1:1.1", "USD:EUR" -> "1:0.8", "INR:EUR" -> "1:0.01", "CNY:EUR" -> "1:0.1")
    val TOPIC = AppConstants.topicName
    //logger.info ("Starting Consumer with topic " + TOPIC)

    val props = new Properties ()
    //val ConsumerProp : InputStream = new FileInputStream("properties/Consumer.properties")
   // props.load(ConsumerProp)
    props.put ("bootstrap.servers", "localhost:9092")
    props.put ("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    props.put ("value.deserializer", "io.confluent.kafka.serializers.KafkaAvroDeserializer")
    props.put ("schema.registry.url", AppConstants.schemaRegistryUrl)
    props.put ("auto.offset.reset", "earliest")
    props.put ("group.id", "1")

    val consumer = new KafkaConsumer[String, Output] (props)

    consumer.subscribe (util.Collections.singletonList (TOPIC) )

    while (true) {
    val records = consumer.poll (Duration.ofMillis (AppConstants.duration) )
    for (record <- records.asScala) {
    val op = Output.newBuilder ()
    val rateToConvert = fixedTable (op.getCurrency + ":" + "EUR")
    val conversionRate = rateToConvert.split (":") (1).toDouble / rateToConvert.split (":").head.toDouble
    val normalisedBookingAmount = op.getBookingAmount * conversionRate
    op.setNormalisedBookingAmount (normalisedBookingAmount).setNormalisedCurrency ("EUR")
    println (record)
  }
  }
 }
}
