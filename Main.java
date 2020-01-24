package com.company;
import java.lang.StringBuilder;

public class Main {
        public void f1() {
            System.out.println("in Main");
            Family family=new Family();
            family.f1();
        }

    public static void main(String[] args) {
        Main obj=new Main();
        obj.f1();
        Person person=new Person();
        person.printDetails();

	// write your code here
    }

    class Family {
        public void f1() {
            System.out.println("in Family" + new StringBuilder().append("hi SB"));
        }
    }
}
