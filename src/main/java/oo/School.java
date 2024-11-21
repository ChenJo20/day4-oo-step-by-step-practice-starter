package oo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class School {
    List<Person> people;

    public School() {
        people = new ArrayList();
    }

    public void enroll(Person person) {
        people.add(person);
    }

    public void startSchool() {
        System.out.println(people.stream()
                .map(Person::introduce)
                .collect(Collectors.joining(System.lineSeparator())));
    }
}
