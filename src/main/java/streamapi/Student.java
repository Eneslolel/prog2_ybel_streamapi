package streamapi;

import java.util.Objects;
/**
 * Represent a student.
 *
 * @param name    Name of the student
 * @param cps     Number of credit points (ECTS)
 * @param program Enrolled degree programme
 */
public record Student(String name, int cps, Enrollment program) {
    /**
     * Check if a student is enrolled in Computer Science.
     *
     * @return {@code true} iff the student is enrolled in Computer Science, otherwise {@code false}
     */
    public boolean isIFM() {
        return program == Enrollment.IFM;
    }
}
