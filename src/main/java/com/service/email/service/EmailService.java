package com.service.email.service;

import com.service.email.dto.EmailDto;

public interface EmailService {
    void sendSimpleMessage(EmailDto emailDto);
}
