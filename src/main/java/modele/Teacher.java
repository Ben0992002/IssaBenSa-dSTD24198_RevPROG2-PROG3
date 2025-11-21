
package modele;

import java.time.LocalDate;

public class Teacher extends Person {

    private String speciality;

    public Teacher(int id, String firstName, String lastName, LocalDate dateBirth, String email, String numberPhone, String speciality) {
        super(id, firstName, lastName, dateBirth, email, numberPhone);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality= speciality;
    }
}