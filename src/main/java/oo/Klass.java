package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Klass {

    public static final String CAN_NOT_FIND_STUDENT_IN_THIS_CLASS_ERROR_MESSAGE = "It is not one of us.";
    private int number;
    private Student classLeader;
    private List<Person> people = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (!student.isIn(this)) {
            System.out.println(CAN_NOT_FIND_STUDENT_IN_THIS_CLASS_ERROR_MESSAGE);
        }
        this.classLeader = student;

        people.stream()
                .filter(people -> people != student)
                .forEach(individual ->
                individual.sayWhenSomeoneBecomeClassLeader(student, this)
                );
    }

    public void attach(Person person) {
        people.add(person);
    }

    public boolean isLeader(Student student) {
        return classLeader == student;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Klass klass)) return false;
        return number == klass.number;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public int getNumber() {
        return number;
    }

    public List<Person> getPeople() {
        return people;
    }
}
