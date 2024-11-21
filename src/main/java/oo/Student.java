package oo;

public class Student extends Person {

    private static final String STUDENT_ROLE = "student";
    public static final String I_AM_IN_CLASS = " I am in class ";
    public static final String I_AM_THE_LEADER_OF_CLASS = " I am the leader of class ";
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Klass getKlass() {
        return klass;
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
        return super.introduce() + introduceRole(STUDENT_ROLE) + introduceClass();
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    @Override
    public void sayWhenSomeoneBecomeClassLeader(Student student, Klass klass){
        System.out.printf(SENTENCE_PATTERN_WHEN_SOMEONE_BECOME_CLASS_LEADER, name, STUDENT_ROLE, klass.getNumber(), student.name);
    }

    public String introduceClass() {
        if (klass == null) {
            return EMPTY;
        }
        if (!klass.isLeader(this)) {
            return I_AM_IN_CLASS + klass.getNumber() + DOT;
        }
        return I_AM_THE_LEADER_OF_CLASS + klass.getNumber() + DOT;
    }

    public boolean isIn(Klass klass) {
        return this.klass == klass;
    }
}
