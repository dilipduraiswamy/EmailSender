package com.sun.wonders.email.sender.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailRequest {

    private String host;
    private String protocol;
    private String userName;
    private String password;
    private Boolean starttls;
    private Boolean smtpAuth;
    private Integer smtpPort;
    private Boolean isSsl;

}
