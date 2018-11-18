package com.phoneOOP3.homework.siit;

public class Message {

    private String phoneNumber;
    private String content;

    public Message(String phoneNumber, String content){
        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", messageContent='" + content + '\'' +
                '}';
    }
}
