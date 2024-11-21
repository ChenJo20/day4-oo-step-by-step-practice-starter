package oo;

import java.util.Objects;

public class Person {

    public static final String INTRODUCE_NAME_AGE_PATTERN = "My name is %s. I am %d years old.";
    public static final String INTRODUCE_ROLE_PATTERN = " I am a %s.";
    protected int id;
    protected String name;
    protected int age;

    public static final String SENTENCE_PATTERN_WHEN_SOMEONE_BECOME_CLASS_LEADER = "I am %s, %s of Class %d. I know %s become Leader.";
    public static final String DOT = ".";
    public static final String EMPTY = "";
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format(INTRODUCE_NAME_AGE_PATTERN, name, age);
    }

    public String introduceRole(String role) {
        return String.format(INTRODUCE_ROLE_PATTERN, role);
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
