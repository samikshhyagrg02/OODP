package workshop_8;

public class GradeCalculator {
     double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public static void main(String[] args) {
        double[] grades = {85.5, 90.0, 78.0, 92.5};
        GradeCalculator gradeCalculator = new GradeCalculator();
        double average = gradeCalculator.calculateAverage(grades);
        System.out.println("The average grade is: " + average);
    }
}

