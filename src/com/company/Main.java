package com.company;

public class Main {

    public static void main(String[] args) {

        EmailNotification email1 = new EmailNotification("Get Er Done", "This is really happening", "admin@test.com", "Gmail");

        TextNotification text1 = new TextNotification("Meet Me", "Come over to my place", "My Main Squeeze", "Verizon");

        email1.transport();

        text1.transport();

        email1.printText();

        Object email1Clone = null;
        try {
            email1Clone = email1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Is clone the same: " + email1Clone.equals(email1));
    }
}
