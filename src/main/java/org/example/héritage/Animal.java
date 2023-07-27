package org.example.héritage;

import java.time.Year;

public class Animal {
    private  String name;
    private int age;
    private String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public  void  shoot(){
        System.out.println("Un animal n'a pas de cri");
    }

    public void toEat(){
        System.out.println("L'animal mange");
    }

    protected int dateOfBirthday(){
        return Year.now().getValue() - age;
    }

    private int nameLength(){
        return this.name.length();
    }

    @Override
    public String toString() {
        return "Animal :" +
                "name= '" + name + '\'' +
                ", age= " + age +
                ", color= '" + color + '\'' +
                '.';
    }
}
