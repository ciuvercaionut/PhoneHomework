package com.phoneOOP3.homework.siit;

public class Contact {

    private double nrCrt;
    private String phoneNumber;
    private String firstName;
    private String lastName;


    public Contact(int nrCrt, String phoneNumber, String firstName, String lastName){
        this.nrCrt = nrCrt;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getNrCrt() {
        return nrCrt;
    }

    public void setNrCrt(double nrCrt) {
        this.nrCrt = nrCrt;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "nrCrt=" + nrCrt +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
