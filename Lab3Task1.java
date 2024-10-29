package lab2.task1;
import java.util.Scanner;
class MarkSheet {
    private String studentName;
    private int totalMarks;
    private int obtainedMarks;

    // Constructor
    public MarkSheet(String studentName, int totalMarks, int obtainedMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
    }

    // Calculate percentage
    public double calculatePercentage() {
        return (double) obtainedMarks / totalMarks * 100;
    }

    // Determine grade
    public String determineGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B+";
        else if (percentage >= 60) return "B";
        else if (percentage >= 50) return "C";
        else return "F";
    }

    // Calculate GPA
    public double calculateGPA() {
        String grade = determineGrade();
        switch (grade) {
            case "A+":
                return 4.0;
            case "A":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            default:
                return 0.0;
        }
    }

    // Display the mark sheet
    public void displayMarkSheet() {
        System.out.println("Mark Sheet");
        System.out.println("-----------");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", calculatePercentage());
        System.out.println("Grade: " + determineGrade());
        System.out.printf("GPA: %.2f\n", calculateGPA());
    }
}

public class Lab3Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input student details
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Total Marks: ");
        int total = scanner.nextInt();
        System.out.print("Enter Obtained Marks: ");
        int obtained = scanner.nextInt();

        // Create MarkSheet instance and display
        MarkSheet markSheet = new MarkSheet(name, total, obtained);
        markSheet.displayMarkSheet();

        scanner.close();
    }
}


