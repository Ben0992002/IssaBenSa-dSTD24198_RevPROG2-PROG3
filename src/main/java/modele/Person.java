package modele;

import java.time.LocalDate;
import java.util.Objects;


public abstract class Person {

    private final int id;
    private String firstName;
    private String lastName;
    private LocalDate dateBirth;
    private String email;
    private String numberPhone;

    public Person(int id, String firstName, String lastName, LocalDate dateBirth, String email, String numberPhone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = dateBirth;
        this.email = email;
        this.numberPhone = numberPhone;
    }

    public int getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; } // Correction de l'ancienne erreur 'getlastName'
    public LocalDate getDateBirth() { return dateBirth; }
    public String getEmail() { return email; }
    public String getNumberPhone() { return numberPhone; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName= lastName; }
    public void setDateBirth(LocalDate dateBirth) { this.dateBirth = dateBirth; }
    public void setEmail(String email) { this.email = email; }
    public void setNumberPhone(String numberPhone) { this.numberPhone = numberPhone; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person personne = (Person) o;
        return id == personne.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
