package oo;

public class Student extends Person {

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object anotherStudent) {
        if (this == anotherStudent) return true;
        if (!(anotherStudent instanceof Student student)) return false;
        return id == student.id;
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a student.", name, age);
    }

}
