
package modele;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Grade {
    private final Exam exam;
    private final Student student;
    private final List<GradeHistory> history = new ArrayList<>();

    public Grade(Exam exam, Student student, double initialValue) {
        this.exam = exam;
        this.student = student;
        this.history.add(new GradeHistory(initialValue, "Initialisation"));
    }

    public void updateGrade(double newValue, String reason) {
        history.add(new GradeHistory(newValue, reason));
    }

    public double getGradeAt(Instant t) {
        return history.stream()
                .filter(h -> !h.getTimestamp().isAfter(t))
                .max(Comparator.comparing(GradeHistory::getTimestamp))
                .map(GradeHistory::getValue)
                .orElse(0.0);
    }

    public Exam getExam() { return exam; }
    public Student getStudent() { return student; }
    public List<GradeHistory> getHistory() { return history; }
}