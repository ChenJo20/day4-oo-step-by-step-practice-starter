package oo;

import java.util.Objects;

public class Person {

    private int id;
    private String name;
    private int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    @Override
    public boolean equals(Object anotherPerson) {
        return anotherPerson instanceof Person && id == ((Person) anotherPerson).id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
