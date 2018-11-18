package com.phoneOOP3.homework.siit;


import java.util.ArrayList;

public interface Phone {

    public void addContact(int nrCrt, String phoneNumber, String firstName, String lastName);

    public void listContacts();

    public void sendMessage(String phoneNumber, String messageContent);

    public ArrayList<Contact> getContacts();

    public void sendMessage(Contact contact, String content);

    public void listMessages(String phoneNumber);

    public void call(String phoneNumber);

    public void viewHistory(String phoneNumber);



}
