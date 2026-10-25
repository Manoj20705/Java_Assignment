package Assignment2;

public class StudentResult {

    int calculateTotal(int a, int b, int c, int d, int e) {
        return a + b + c + d + e;
    }

    double calculateAverage(int totalMarks) {
        return totalMarks / 5.0;
    }

    String calculateGrade(double avg) {
        if (avg >= 90) {
        	return "A";
        }
        else if (avg >= 75) {
        	return "B";
        }
        else if (avg >= 50) {
        	return "C";
        }
        else {
        	return "Fail";
        }
    }

    void displayResult(int totalMarks, double avg, String grade) {
        System.out.println("Total: " + totalMarks);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentResult obj = new StudentResult();

        int totalMarks = obj.calculateTotal(85, 78, 92, 88, 77);
        double avgMarks = obj.calculateAverage(totalMarks);
        String resultGrade = obj.calculateGrade(avgMarks);

        obj.displayResult(totalMarks, avgMarks, resultGrade);
    }
}
