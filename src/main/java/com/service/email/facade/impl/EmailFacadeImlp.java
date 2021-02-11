package com.service.email.facade.impl;

import javax.annotation.Resource;

import com.service.email.dto.EmailDto;
import com.service.email.facade.EmailFacade;
import com.service.email.model.EmailModel;
import com.service.email.service.EmailService;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class EmailFacadeImlp implements EmailFacade {

    @Resource
    private EmailService emailService;

    private final ModelMapper map = new ModelMapper();
    @Override
    public boolean sendEmail(EmailModel emailModel) {
        EmailDto emailDto = map.map(emailModel, EmailDto.class);
        emailService.sendSimpleMessage(emailDto);
        return true;
    }
}
