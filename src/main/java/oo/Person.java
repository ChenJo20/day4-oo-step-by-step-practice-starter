package oo;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.printf("My name is %s. I am %d years old.", name, age);
        My name is Tom. I am 18 years old.
    }
}
