package com.perfecciondigital.taller.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableBinding(Sink.class)
@Service
public class MessageService {
	
	@StreamListener(Sink.INPUT)
	public void read(Message<String> message) {
		log.info("message: " + message.getPayload());
	}
	
	@StreamListener(Sink.INPUT)
	public void read(com.perfecciondigital.taller.model.Message message) {
		log.info("message: " + message);
	}

}
