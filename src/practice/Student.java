package practice;

public class Student {
    private int id;
    private String name;
    private int score;

    public Student(int id, String name, int score) {
        this.id = id;
        this.name = name;
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            this.score = 0;
            System.out.println("invalid input, score must between 0-100.");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int score() {
        return score;
    }

    public void setScore(int score) {
        if (score >= 0 && score <= 100) {
            this.score = score;
        } else {
            System.out.println("invalid input,score must between 0-100.");
        }
    }

    public void printInfo() {
        System.out.println(id + "|" + name + "|" + score);
        
    }
}
