package com.company;

public class Person {
    String name="Amar"+1;
    int age=20;
    String mobile="9876543210";

    public void setName(String name) {
        this.name = name;
    }
    public void printDetails(){
        System.out.println(name+" is "+age+" years old. Can be reached at "+mobile);
    }
}
