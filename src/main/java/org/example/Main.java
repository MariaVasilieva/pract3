package org.example;

import task1.EncryptionDecorator;
import task1.HtmlDecorator;
import task1.Message;
import task1.SimpleMessage;

import task2.ConsoleRenderer;
import task2.HtmlRenderer;
import task2.Renderer;
import task2.TextMessage;
import task2.WarningMessage;

public class Main {
    public static void main(String[] args) {
        // ===== Task 1: Decorator =====
        Message message = new SimpleMessage("Hello, world!");

        Message htmlMessage = new HtmlDecorator(message);
        System.out.println("HTML: " + htmlMessage.getContent());

        Message encryptedMessage = new EncryptionDecorator(message);
        System.out.println("Encrypted: " + encryptedMessage.getContent());

        Message combinedMessage = new HtmlDecorator(new EncryptionDecorator(message));
        System.out.println("Fancy: " + combinedMessage.getContent());

        // ===== Task 2: Bridge =====
        Renderer consoleRenderer = new ConsoleRenderer();
        Renderer htmlRenderer = new HtmlRenderer();

        TextMessage textConsole = new TextMessage(consoleRenderer, "Hello", "This is a simple message.");
        WarningMessage warningConsole = new WarningMessage(consoleRenderer, "Low Battery", "Please charge your device.");
        TextMessage textHtml = new TextMessage(htmlRenderer, "Greetings", "This is shown in HTML.");
        WarningMessage warningHtml = new WarningMessage(htmlRenderer, "Overheating", "System temperature is too high!");

        System.out.println(textConsole.display()+"\n");
        System.out.println(warningConsole.display()+"\n");
        System.out.println(textHtml.display()+"\n");
        System.out.println(warningHtml.display());
    }
}
