package oo.step7;

import oo.Klass;
import oo.School;
import oo.Student;
import oo.Teacher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.util.List;
//import oo.Klass;
//import oo.School;
//import oo.Student;
//import oo.Teacher;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
public class SchoolTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setup() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void should_print_message_when_start_school() {
        // Given
        School school = new School();
        Klass klass1 = new Klass(1);
        Klass klass2 = new Klass(2);
        Teacher jerry = new Teacher(1, "Jerry", 21);
        Teacher doraemon = new Teacher(2, "Doraemon", 21);
        school.enroll(jerry);
        school.enroll(doraemon);
        jerry.assignTo(klass1);
        klass1.attach(jerry);
        jerry.assignTo(klass2);
        klass2.attach(jerry);
        doraemon.assignTo(klass1);
        klass1.attach(doraemon);

        Student tom = new Student(1, "Tom", 18);
        school.enroll(tom);
        tom.join(klass2);

        // When
        school.startSchool();

        // Then
        assertThat(systemOut()).contains("My name is Jerry. I am 21 years old. I am a teacher. I teach Class 1, 2.");
        assertThat(systemOut()).contains("My name is Doraemon. I am 21 years old. I am a teacher. I teach Class 1.");
        assertThat(systemOut()).contains("My name is Tom. I am 18 years old. I am a student. I am in class 2.");
    }

    private String systemOut() {
        return outContent.toString();
    }
}
