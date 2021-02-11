package com.service.email.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmailModel {
    private String to;
    private String cc;
    private String bcc;
    private String subject;
    private String text;
}
