
package org.example
import org.apache.kafka.clients.producer.KafkaProducer
import org.apache.kafka.clients.producer.ProducerRecord
import java.util.Properties
import java.io.{FileInputStream, InputStream}
import scala.collection.JavaConverters._
import org.apache.logging.log4j.{LogManager, Logger}
import io.confluent.kafka.serializers.KafkaAvroSerializer

//import scala.sys.process.processInternal.InputStream

object Producer  {

  def runProducer(): Unit = {
  //var logger: Logger = LogManager.getLogger()
  //logger.info("Creating Kafka Producer...")

  val props = new Properties()
  val topic = AppConstants.topicName

  //val producerProp : InputStream = new FileInputStream("properties/Producer.properties")
  //props.load(producerProp)
    props.put ("bootstrap.servers", AppConstants.bootstrapServers)
    props.put ("enable.idempotence", "true")
    props.put ("request.required.acks", "1")
    props.put ("message.send.max.retries", "3")
    props.put ("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put ("value.serializer", "io.confluent.kafka.serializers.KafkaAvroSerializer")
    props.put ("schema.registry.url", "http://localhost:8081")

  val dummyInput: Booking = Booking.newBuilder()
    .setCity("Mumbai")
    .setCurrency("INR")
    .setHotelId(22)
    .setBookingAmount(2598.54)
    .setNightsBooked(2)
    .setReservationId(1000)
    .build()

  val producer = new KafkaProducer[String, Booking]((props))
  //logger.info("Start sending messages...")

  for (i <- 1 to AppConstants.numEvents) {
    val record = new ProducerRecord(topic, "key" , dummyInput)
    try {
      println("herererere " + record )
      producer.send(record)

    }
    catch {
      case e: Throwable => println("Error occured "+ e)
    } finally {
      producer.flush
      producer.close

    }
    }
  }
}
