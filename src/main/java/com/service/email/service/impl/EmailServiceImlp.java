package com.service.email.service.impl;

import javax.annotation.Resource;

import com.service.email.dto.EmailDto;
import com.service.email.service.EmailService;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImlp implements EmailService {
    @Resource
    private JavaMailSender emailSender;
    
    public void sendSimpleMessage(EmailDto emailDto) {
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("springtuyen2021@gmail.com");
        message.setTo(emailDto.getTo()); 
        message.setSubject(emailDto.getSubject()); 
        message.setText(emailDto.getText());
        emailSender.send(message);
    }
}
