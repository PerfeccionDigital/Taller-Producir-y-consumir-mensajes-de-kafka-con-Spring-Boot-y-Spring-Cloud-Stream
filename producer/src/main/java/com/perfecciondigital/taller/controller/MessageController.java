package com.perfecciondigital.taller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perfecciondigital.taller.model.Message;
import com.perfecciondigital.taller.service.MessageService;

@RestController
@RequestMapping("message")
public class MessageController {
	
	@Autowired
	private MessageService messageService;
	
	@PostMapping
	public void send(@RequestBody Message message) {
		messageService.send(message);
	}

}
