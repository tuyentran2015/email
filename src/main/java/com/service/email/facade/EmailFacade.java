package com.service.email.facade;

import com.service.email.model.EmailModel;

public interface EmailFacade {
    boolean sendEmail(EmailModel emailModel);
}
