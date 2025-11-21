package modele;

import java.time.Instant;

public class Exam {
    private final int id;
    private String title;
    private Course course;
    private double coefficient;
    private Instant dateExam;

    public Exam(int id, String title, Course course, double coefficient, Instant dateExam) {
        this.id = id;
        this.title = title;
        this.course = course;
        this.coefficient = coefficient;
        this.dateExam = dateExam;
    }

    public int getId() { return id; }
    public Course getCourse() { return course; }
    public double getCoefficient() { return coefficient; }
    public Instant getDateExam() { return dateExam; }
}