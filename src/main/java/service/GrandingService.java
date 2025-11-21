
package service;

import modele.Course;
import modele.Exam;
import modele.Student;
import modele.Grade;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

public class GradingService {

    private final List<Grade> allGrades; // Base de données simulée des notes

    public GradingService(List<Grade> allGrades) {
        this.allGrades = allGrades;
    }

    public double getExamGrade(Exam exam, Student student, Instant t) {
        return allGrades.stream()
                .filter(g -> g.getExam().equals(exam) && g.getStudent().equals(student))
                .findFirst() // Récupère l'objet Grade (la note de cet examen/étudiant)
                .map(g -> g.getGradeAt(t)) // Utilise la méthode historique
                .orElse(0.0);
    }


    public double getCourseGrade(Course course, Student student, Instant t) {

        // 1. Trouver tous les examens pour ce cours (pour les coefficients)
        List<Exam> courseExams = allGrades.stream()
                .map(Grade::getExam)
                .filter(e -> e.getCourse().equals(course))
                .distinct()
                .collect(Collectors.toList());

        double totalWeightedGrade = 0.0;
        double totalCoefficient = 0.0;

        for (Exam exam : courseExams) {
            // 2. Récupérer la note de cet examen à l'instant 't'
            double grade = getExamGrade(exam, student, t);
            double coefficient = exam.getCoefficient();

            totalWeightedGrade += grade * coefficient;
            totalCoefficient += coefficient;
        }

        // 3. Calculer la moyenne pondérée
        if (totalCoefficient == 0) {
            return 0.0;
        }
        return totalWeightedGrade / totalCoefficient;
    }
}