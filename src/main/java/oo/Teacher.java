package oo;

public class Teacher extends Person {

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a teacher.", name, age);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object anotherTeacher) {
        if (this == anotherTeacher) return true;
        if (!(anotherTeacher instanceof Teacher teacher)) return false;
        return id == teacher.id;
    }

}
