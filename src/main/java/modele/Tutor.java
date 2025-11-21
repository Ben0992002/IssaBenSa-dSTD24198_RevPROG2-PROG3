package modele;

import java.time.LocalDate;

public class Tutor extends Person {

    private String tutorStudent;

    public Tutor(int id, String firstName, String lastName, LocalDate dateBirth, String email, String numberPhone, String tutorStudent) {
        super(id, firstName, lastName, dateBirth, email, numberPhone);
        this.tutorStudent = tutorStudent;
    }

    public String tutorStudent() {
        return tutorStudent;
    }

    public void tutorStudent(String tutorStudent) {
        this.tutorStudent = tutorStudent;
    }
}