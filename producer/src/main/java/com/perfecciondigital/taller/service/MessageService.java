package com.perfecciondigital.taller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.perfecciondigital.taller.model.Message;

@EnableBinding(Source.class)
@Service
public class MessageService {
	
	@Autowired
	private Source source;
	
	@SendTo
	public boolean send(Message message) {
		return source.output().send(MessageBuilder.withPayload(message).build());
	}

}
