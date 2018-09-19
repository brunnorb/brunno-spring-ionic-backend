package com.brunno.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.brunno.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
