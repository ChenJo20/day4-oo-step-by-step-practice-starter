package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person {

    private static final String TEACHER_ROLE = "teacher";

    private List<Klass> klasses = new ArrayList<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        return super.introduce() + " I am a " + TEACHER_ROLE + "." + introduceClass();
    }

    @Override
    public void sayWhenSomeoneBecomeClassLeader(Student student, Klass klass){
        System.out.println(String.format(SENTENCE_PATTERN_WHEN_SOMEONE_BECOME_CLASS_LEADER, name, TEACHER_ROLE, klass.getNumber(), student.name));
    }

    public void assignTo(Klass klass) {
        klasses.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return klasses.contains(klass);
    }

    public boolean isTeaching(Student student) {
        return klasses.contains(student.getKlass());
    }

    public String introduceClass() {
        if (klasses.isEmpty()) {
            return "";
        }
        return " I teach Class " + klasses.stream()
                .map(Klass::getNumber)
                .map(String::valueOf)
                .collect(Collectors.joining(", ")) + ".";
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
