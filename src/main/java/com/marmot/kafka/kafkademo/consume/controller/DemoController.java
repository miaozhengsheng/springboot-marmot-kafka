package com.marmot.kafka.kafkademo.consume.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DemoController {

	
	@RequestMapping("/testjson")
	public  Map<String, String> testJson(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("id",String.valueOf(1L));
		map.put("name","zhengsheng");
		
		return map;
	}
	
}
