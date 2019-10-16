package com.marmot.kafka.kafkademo.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	private static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
    // private Gson gson = new GsonBuilder().create();

    @KafkaListener(topics = "mutipl-partitions-topic")
    public void onMessage(String payMessage) {
        logger.info("MessageConsumer: onMessage: message is: [" + payMessage + "]");
    }
}
