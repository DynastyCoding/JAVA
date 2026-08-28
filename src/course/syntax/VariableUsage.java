package course.syntax;

public class VariableUsage {
    public static void displayBasicTypes() {
        byte studentAge = 18;
        short studentCount = 1200;
        long earthAge = 4540000000l;
        float temperature = 36.5f;
        double pi = 3.14159;
        boolean isAdult = true;
        char score = 'A';
        boolean willRain = false;

        System.out.println("學生年齡：" + studentAge);
        System.out.println("全校學生人數：" + studentCount);
        System.out.println("地球年齡：" + earthAge);
        System.out.println("體溫：" + temperature);
        System.out.println("圓周率：" + pi);
        System.out.println("是否成年：" + isAdult);
        System.out.println("成績等級：" + score);
        System.out.println("是否下雨：" + willRain);

    }

    public static void displayPersonSummary() {
        char gender = 'm';
        byte age = 29;
        float height = 172.3f;
        boolean isStudent = false;

        System.out.println("Gender: " + gender + "," + age + "years old," +
                height + "cm," + "Is student?" + isStudent);
    }

    public static void displayProfileDetails() {

        int age = 29;
        String name = "Levi";
        double height = 172.5;
        double weight = 69.7;
        boolean isStudent = false;

        System.out.println("Im " + age + "years old");
        System.out.println("My name is " + name);
        System.out.println("Im " + height + "cm");
        System.out.println("Im " + weight + "kg");
        System.out.println("Is student? " + isStudent);
    }

    public static void main(String[] args) {
        displayBasicTypes();
        displayPersonSummary();
        displayProfileDetails();
    }
}
