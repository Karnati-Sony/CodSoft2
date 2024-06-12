import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Welcome to the Student Grade Calculator!");
            System.out.print("Please enter the number of subjects: ");
            int numSubjects = scan.nextInt();

            int totalMarks = 0;
            for (int i = 1; i <= numSubjects; i++) {
                System.out.print("Enter the marks for subject " + i + ": ");
                int marks = scan.nextInt();
                totalMarks += marks;
            }

            double averagePercentage = (double) totalMarks / numSubjects;

            System.out.println("Aggregate Marks: " + totalMarks);
            System.out.println("Overall Percentage: " + averagePercentage);

            char grade = determineGrade(averagePercentage);
            System.out.println("Final Grade: " + grade);
        }
    }

    public static char determineGrade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
