package org.example;


import task1.EncryptionDecorator;
import task1.HtmlDecorator;
import task1.Message;
import task1.SimpleMessage;

public class Main {
    public static void main(String[] args) {
        //task1
        Message message = new SimpleMessage("Hello, world!");

        Message htmlMessage = new HtmlDecorator(message);
        System.out.println("HTML: " + htmlMessage.getContent());

        Message encryptedMessage = new EncryptionDecorator(message);
        System.out.println("Encrypted: " + encryptedMessage.getContent());

        Message fancyMessage = new HtmlDecorator(new EncryptionDecorator(message));
        System.out.println("Fancy: " + fancyMessage.getContent());


    }
}