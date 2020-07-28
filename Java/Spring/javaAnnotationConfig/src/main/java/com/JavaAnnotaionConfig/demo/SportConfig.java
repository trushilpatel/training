package com.JavaAnnotaionConfig.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.JavaAnnotaionConfig.demo")
@PropertySource("classpath:Sport.properties")
public class SportConfig {
	
	@Bean
	public Message message() {
		Message m = new Message();
		return m;
	}
}
