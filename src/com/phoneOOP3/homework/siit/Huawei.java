package com.phoneOOP3.homework.siit;

import java.util.ArrayList;
import java.util.Random;

public abstract class Huawei implements Phone{

    public Huawei(){

    }

    private double batteryLife;
    private String color;
    private String material;
    private String imei;
    private ArrayList<Contact> contacts = new ArrayList();
    private ArrayList<Message> messages = new ArrayList<>();
    private ArrayList<Call> calls = new ArrayList<>();

    public Huawei(double batteryLife, String color, String material, String imei) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.imei = imei;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public String getImei() {
        System.out.println("\nIMEI: huawei." +imei);
        return imei;
    }

    @Override
    public void addContact(int nrCrt, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(nrCrt, phoneNumber, firstName, lastName);
        contacts.add(contact);
    }

    @Override
    public void listContacts() {
        System.out.println();
        for(Contact contact: contacts){
            System.out.println(contact);
        }
    }

    @Override
    public void sendMessage(String phoneNumber, String content) {
        if(batteryLife < 5){
            System.out.println("Battery to low to send a message!");
        }else {
            Message message = new Message(phoneNumber, content);
            messages.add(message);
            batteryLife -= 5;
        }
    }

    public void sendMessage(Contact contact, String content){
        this.sendMessage(contact.getPhoneNumber(), content);
        batteryLife -= 5;
    }

    @Override
    public void listMessages(String phoneNumber) {
        System.out.println();
        for (int i = 0; i < messages.size(); i++){
          Message  flag = messages.get(i);

            if(flag.getPhoneNumber() == phoneNumber) {
                System.out.println("Message number " + (i + 1) + " : " + "'" + flag.getContent() + "'");
            }
        }
    }

    @Override
    public void call(String phoneNumber) {

        if(batteryLife < 10){
            System.out.println("\nNot enough battery to make another call!Please charge your battery!");
        }else {
            Call call = new Call(phoneNumber);
            calls.add(call);
            batteryLife -= 20;
        }
    }

    @Override
    public void viewHistory(String phoneNumber) {
        System.out.println();
        for(Call call : calls){
            System.out.println("Dialled number: " + call.getPhoneNumber());
        }
    }

    public static String generateImei(){

        Random r = new java.util.Random();
        String s = Integer.toString(r.nextInt() & Integer.MAX_VALUE, 9);
        return s;
    }

    public double getBatteryLife(double batteryLife){
        System.out.println("\n Current battery life");
        return batteryLife;
    }

}
