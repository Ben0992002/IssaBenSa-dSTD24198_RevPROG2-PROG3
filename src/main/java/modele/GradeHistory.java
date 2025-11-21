package modele;

import java.time.Instant;

public class GradeHistory {
    private final double value;
    private final String reason; // Motif du changement
    private final Instant timestamp; // Daté à l'heure près

    public GradeHistory(double value, String reason) {
        this.value = value;
        this.reason = reason;
        this.timestamp = Instant.now(); // Enregistre l'heure de création
    }

    public double getValue() { return value; }
    public Instant getTimestamp() { return timestamp; }
    public String getReason() { return reason; }
}