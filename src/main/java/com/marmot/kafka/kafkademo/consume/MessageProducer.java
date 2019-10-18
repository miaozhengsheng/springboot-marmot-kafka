package com.marmot.kafka.kafkademo.consume;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {
	private static Logger logger = LoggerFactory.getLogger(MessageProducer.class);
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	public MessageProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

    public void onMessage(String payMessage) {
        logger.info("MessageConsumer: onMessage: message is: [" + payMessage + "]");
        
        new Thread(()->{
        	try {
				Thread.sleep(3000);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
        	for(int i=0;i<1000;i++){
            	kafkaTemplate.send("mutipl-partitions-topic","key-"+i, "message index "+i);
            	try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        }).start();;
        
    }
}
