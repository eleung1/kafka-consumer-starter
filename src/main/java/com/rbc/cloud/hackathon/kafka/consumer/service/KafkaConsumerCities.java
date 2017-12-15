package com.rbc.cloud.hackathon.kafka.consumer.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import com.rbc.cloud.hackathon.data.Cities;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.List;
import java.util.UUID;

@Component
@Profile("cities")
public class KafkaConsumerCities {

  private Logger logger = LoggerFactory.getLogger(KafkaConsumerCities.class);
  @Value("${topic.name}")
  String topicName;
  @Value("${eric.output.path}")
  String outputFilePath;

  @KafkaListener(id = "ZeusListenerCities", topics = "#{'${topic.name}'}", containerFactory = "ZeusListenerFactory")
  private void listen(final List<ConsumerRecord<String, Cities>> messages, final Acknowledgment ack)
      throws IOException {
    logger.info("Received {} messages, iterating..", messages.size());
    //PrintWriter writer = new PrintWriter(outputFilePath, "UTF-8");
    for (ConsumerRecord<String, Cities> record : messages) {
      String key = record.key();
      Cities value = record.value();
      ack.acknowledge();
      logger.info(" consumed message : key[{}] = payload[{}]", key, value);
      //writer.println(String.format("consumed message : key[{}] = payload[{}]", key, value));
      
      try (FileWriter fw = new FileWriter(outputFilePath, true);
          BufferedWriter bw = new BufferedWriter(fw);
          PrintWriter out = new PrintWriter(bw)) {
          out.println(String.format(" consumed message : key[%s] = payload[%s]", key, value));
      }
    }
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    //writer.close();
    logger.info("Done with this batch");
  }
}
