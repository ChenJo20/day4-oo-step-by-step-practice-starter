package oo;

public class Student extends Person {

    private static final String STUDENT_ROLE = "student";
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
        return super.introduce() + " I am a " + STUDENT_ROLE + "." + introduceClass();
    }

    public void join(Klass klass) {
        this.klass = klass;
        klass.getStudents().add(this);
    }

    public String introduceClass() {
        if (klass == null) {
            return "";
        }
        if (!klass.isLeader(this)) {
            return " I am in class " + klass.getNumber() + ".";
        }
        return " I am the leader of class " + klass.getNumber() + ".";
    }

    public boolean isIn(Klass klass) {
        return this.klass == klass;
    }
}
