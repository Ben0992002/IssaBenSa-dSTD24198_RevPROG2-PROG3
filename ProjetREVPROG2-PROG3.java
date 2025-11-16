package modele;

import java.time.LocalDate;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateBirth;
    private String email;
    private String phoneNumber;
    private String group;
    private String tutor;

    public Student (int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateBirth = null;
        this.email = null;
        this.phoneNumber = "";
        this.group = "No renseigné";
        this.tutor = null;
    }

    public void setId(int newId){
        if (newId > 0){
            this.id = newId;
        } else {
            System.out.println("ERREUR: L'ID de l'étudiant doit être un nombre positif.");
        }
    }
    public int getId(){
        return this.id;
    }
    public void setFirstName(String newFirstName){
        if ( newFirstName != null && !newFirstName.trim().isEmpty()){
            this.firstName = newFirstName;
        } else {
            System.out.println("ERREUR: Le prénom ne peut pas être vide ou null. La modification a été bloquée.")
        }
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setLastName(String newLastName){
        if (newLastName != null && !newLastName.trim().isEmpty()){
            this.lastName = newLastName;
        } else {
            System.out.println("ERREUR: Le nom ne peut pas être vide ou null. La modification a été bloquée.");
        }
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setDateBirth(LocalDate newDateBirth){
        if (newDateBirth == null || newDateBirth.isAfter(LocalDate.now())){
            System.out.println("ERREUR: La date de naissance ne peut pas être ni nulle ni dans le futur.")
        } else {
            this.dateBirth = newDateBirth;
        }
    }
    public LocalDate getDateBirth(){
        return this.dateBirth;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String newEmail){
        if(newEmail != null && newEmail.contains("@") && !newEmail.trim().isEmpty()){
            this.email = newEmail.trim();
        } else {
            System.out.println("ERREUR: L'adresse email n'est pas valide (doit contenir '@' et ne pas être vide)." );
        }
    }
    public String getphoneNumber (){
        return this.phoneNumber;
    }
    public void setPhoneNumber(String newPhoneNumber){
        if(newPhoneNumber != null && newPhoneNumber.trim().length() > 5){
            this.phoneNumber = newPhoneNumber.trim();
        } else {
            System.out.println("ERREUR: Le numéro de téléphone n'est pas valide.");
        }
    }
}
