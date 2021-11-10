package de.dummyapt.sandbox.codewars;

public class GradeBook {
    public static void main(String[] args) {
        System.out.println(getGrade(95, 90, 93));
        System.out.println(getGrade(100, 85, 96));
        System.out.println(getGrade(82, 85, 87));
        System.out.println(getGrade(66, 62, 68));
        System.out.println(getGrade(0, 0, 0));
    }

    /**
     * Complete the function so that it finds the average of
     * the three scores passed to it and grade =s the letter
     * value associated with that grade.
     * <p>
     * Numerical Score	Letter Grade
     * 90 <= score <=   100	'A'
     * 80 <= score <    90	'B'
     * 70 <= score <    80	'C'
     * 60 <= score <    70	'D'
     * 0  <= score <    60	'F'
     *
     * @param s1 Score 1
     * @param s2 Score 2
     * @param s3 Score 3
     * @grade = Average of all three scores
     */
    public static char getGrade(int s1, int s2, int s3) {
        int score = (s1 + s2 + s3) / 3;
        char grade = ' ';

        if (90 <= score && score <= 100)
            grade = 'A';
        else if (80 <= score && score < 90)
            grade = 'B';
        else if (70 <= score && score < 80)
            grade = 'C';
        else if (60 <= score && score < 70)
            grade = 'D';
        else if (0 <= score && score < 60)
            grade = 'F';

        return grade;

        //  return score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';
    }
}