package oo;

import java.util.Objects;

public class Person {

    protected int id;
    protected String name;
    protected int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
    }

    public void sayWhenSomeoneBecomeClassLeader(Student student, Klass klass) {
        return;
    }

    @Override
    public boolean equals(Object anotherPerson) {
        if (this == anotherPerson) return true;
        if (!(anotherPerson instanceof Person person)) return false;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
