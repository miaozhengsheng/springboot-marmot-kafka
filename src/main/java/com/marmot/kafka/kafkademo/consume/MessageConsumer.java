package com.marmot.kafka.kafkademo.consume;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
	private static Logger logger = LoggerFactory.getLogger(MessageConsumer.class);

    @KafkaListener(topics = "mutipl-partitions-topic",groupId="mutipl-partitions-topi-groupid")
    public void onMessage1(String payMessage) {
    	/**
    	 * 一个partition 只能被一个 sub消费
    	 * 一份sub可以消耗多个partition
    	 */
        logger.info("MessageConsumer1: onMessage: message is: [" + payMessage + "]");
    }
    
    @KafkaListener(topics = "mutipl-partitions-topic",groupId="mutipl-partitions-topi-groupid")
    public void onMessage2(String payMessage) {
    	/**
    	 * 一个partition 只能被一个 sub消费
    	 * 一份sub可以消耗多个partition
    	 */
        logger.info("MessageConsumer2: onMessage: message is: [" + payMessage + "]");
    }
}
