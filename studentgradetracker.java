import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        // Input student grades
        for (int i = 0; i < numStudents; i++) {
            int mark;
            do {
                System.out.print("Enter grade for student " + (i + 1) + " (0-100): ");
                mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid grade! Please enter between 0 and 100.");
                }
            } while (mark < 0 || mark > 100);
            grades.add(mark);
        }

        // Calculate average, highest, and lowest
        int sum = 0;
        int highest = grades.get(0);
        int lowest = grades.get(0);

        for (int grade : grades) {
            sum += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = (double) sum / numStudents;

        // Display summary
        System.out.println("\n--- Student Grade Summary ---");
        System.out.println("Total number of students: " + numStudents);
        System.out.println("Grades: " + grades);
        System.out.printf("Average Grade: %.2f%n", average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);

        sc.close();
    }
}
