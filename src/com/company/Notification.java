package com.company;

import java.time.LocalDateTime;

/**
 * Created by macuser on 7/19/17.
 */
public abstract class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status = "Pending";

    public Notification(String subject, String body) {
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public abstract void transport();


    public String getStatus() {
        return status;
    }

    public String showStatus() {
        System.out.println(getStatus());
        return status;
    }

    protected void printText() {
        System.out.println("This is text from Notification");
    }
}
