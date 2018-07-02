package com.lsnova.TaskThree.domain;

import lombok.Getter;

@Getter
public class Mail {
    private String mailTo;
    private String subject;
    private String message;

    public Mail(String mailTo, String subject, String message) {
        this.mailTo = mailTo;
        this.subject = subject;
        this.message = message;
    }
}