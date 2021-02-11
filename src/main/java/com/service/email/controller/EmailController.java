package com.service.email.controller;

import javax.annotation.Resource;

import com.service.email.facade.EmailFacade;
import com.service.email.model.EmailModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("email")
public class EmailController {
    
    @Resource
    private EmailFacade emailFacade;
    @GetMapping("send")
    public String send (@ModelAttribute("email_model") EmailModel emailModel) {
        boolean result = emailFacade.sendEmail(emailModel);
        if(result){
            return "send email successful";
        }
        return "send email unsuccessful";
    }
}
