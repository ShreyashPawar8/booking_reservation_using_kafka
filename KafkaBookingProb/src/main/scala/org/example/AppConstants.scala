package org.example

object AppConstants  {

    val applicationID : String = "kafka_project"
    val bootstrapServers = "localhost:9092"

    val topicName = "booking"
    val numEvents = 5000
    val duration = 1000
    val schemaRegistryUrl = "http://localhost:8081"
}
