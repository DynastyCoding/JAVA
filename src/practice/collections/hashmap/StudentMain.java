package practice.collections.hashmap;

public class StudentMain {
    public static void main(String[] args) {
        StudentScore map = new StudentScore();

        map.addOrUpdateScore("S001", 85);
        map.addOrUpdateScore("S002", 92);
        map.addOrUpdateScore("S003", 78);

        map.addOrUpdateScore("S001", 95);

        System.out.println("S001 score: " + map.getScore("S001"));
        System.out.println("S999 score: " + map.getScore("S999"));

        System.out.println("Total students numbers: " + map.getTotalStudents());
        System.out.println("Average score: " + map.getAverageScore());
        System.out.println("Top student: " + map.getTopStudent());

        System.out.println("Remove S002: " + map.removeStudent("S002"));
        System.out.println("Remove S999: " + map.removeStudent("S999"));
        System.out.println("Total students numbers: " + map.getTotalStudents());

        map.printAllScores();

    }
}
