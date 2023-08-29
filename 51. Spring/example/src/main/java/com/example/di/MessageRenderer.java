package com.example.di;

public class MessageRenderer {

    public void render() {
        // MessageProvider messageProvider = new HelloWorldMessageProvider();
        MessageProvider messageProvider = new HiWorldMessageProvider();

        System.out.println(messageProvider.getMessage());
    }

    public static void main(String[] args) {
        MessageRenderer rederer = new MessageRenderer();
        rederer.render();
    }
}
