package com.marmot.kafka.kafkademo.consume;


import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class KafkaConsumeAware implements ApplicationContextAware{

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		
		System.out.println("服务启动完成");
	}


	
	

}
