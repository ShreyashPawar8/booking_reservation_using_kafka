package org.example

object RunMain {

  def main(args: Array[String]): Unit={

    if(args.head.equals("PRODUCER")) {
      Producer.runProducer()

    }  else {
      Consumer.runConsumer()

    }

  }

}
