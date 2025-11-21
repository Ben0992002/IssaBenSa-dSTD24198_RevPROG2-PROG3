package modele;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    private String group;
    private Tutor tutor;

    private final List<Grade> grades = new ArrayList<>();

    public Student(int id, String firstName, String lastName, LocalDate dateBirth, String email, String numberPhone, String group, Tutor tutor) {
        super(id, firstName, lastName, dateBirth, email, numberPhone);
        this.group = group;
        this.tutor = tutor;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String groupe) {
        this.group = groupe;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void ajouterGrades(Grade note) {
        this.grades.add(note);
    }
}