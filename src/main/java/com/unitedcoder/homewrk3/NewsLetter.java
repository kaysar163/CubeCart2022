package com.unitedcoder.homewrk3;

public class NewsLetter {
    private String subject;
    private String senderName;
    private String senderEmail;

    public NewsLetter() {
    }

    public NewsLetter(String subject, String senderName, String senderEmail) {
        this.subject = subject;
        this.senderName = senderName;
        this.senderEmail = senderEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    @Override
    public String toString() {
        return "NewLeeter{" +
                "subject='" + subject + '\'' +
                ", senderName='" + senderName + '\'' +
                ", senderEmail='" + senderEmail + '\'' +
                '}';
    }
}
