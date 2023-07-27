package org.example.abstraite;

public class Chat extends Animal{
    public Chat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void shoot() {
        System.out.println("Miaou Miaou");
    }
}
