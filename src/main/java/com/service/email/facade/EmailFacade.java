package com.service.email.facade;

import com.service.email.model.EmailModel;

public interface EmailFacade {
    String sendEmail(EmailModel emailModel);
}
