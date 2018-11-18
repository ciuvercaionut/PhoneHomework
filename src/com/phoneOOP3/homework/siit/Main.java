package com.phoneOOP3.homework.siit;

public class Main {

    public static void main(String[] args) {

         Phone phone = new P10();

         ((P10) phone).getImei();

         phone.addContact(1,"0755070628","Ionut", "Ciuverca");
         phone.addContact(2,"23123","sdsad","Paul");

         phone.listContacts();

         phone.sendMessage("0755070628", "Hai acasa!");
         phone.sendMessage("0755070628", "du-te in fasole");
         phone.sendMessage(phone.getContacts().get(0), "hai lasa");
         phone.sendMessage(phone.getContacts().get(1), "Ce tare!");

         phone.listMessages("0755070628");
         phone.listMessages("23123");

         phone.call("123");
         phone.call("123");
         phone.viewHistory("123");


    }
}
