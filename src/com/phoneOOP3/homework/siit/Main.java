package com.phoneOOP3.homework.siit;

public class Main {

    public static void main(String[] args) {

         Phone phone = new Note8();

         phone.getImei();

         phone.addContact(1,"0755070628","Ionut", "Ciuverca");
         phone.addContact(2,"0745217489","Neli","Iakab");

         phone.listContacts();

         phone.sendMessage("0755070628", "Salut!");
         phone.sendMessage("0755070628", "Ce faci?");
         phone.sendMessage(phone.getContacts().get(0), "Totul e ok");
         phone.sendMessage(phone.getContacts().get(1), "Hai la masa");

         phone.listMessages("0755070628");
         phone.listMessages("0745217489");

         phone.call("0745217489");
         phone.call("0755070628");
         phone.viewHistory("0745217489");
    }
}
