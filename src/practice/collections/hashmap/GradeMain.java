package practice.collections.hashmap;

public class GradeMain {
    public static void main(String[] args) {
        GradeReport reports = new GradeReport();

        reports.addOrUpdateGrade("S001", 95);
        reports.addOrUpdateGrade("S002", 82);
        reports.addOrUpdateGrade("S003", 73);
        reports.addOrUpdateGrade("S004", 66);
        reports.addOrUpdateGrade("S005", 55);
        reports.addOrUpdateGrade("S006", 91);

        System.out.println("All grades: ");
        reports.printAllGrades();

        System.out.println("Passing students: " + reports.getPassingStudents());

        System.out.println("Average: " + reports.getAverage());
    }
}
