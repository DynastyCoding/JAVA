package Java.oop;

public class InheritanceDemo {

    static class Father {
        protected String name;

        Father(String name) {
            this.name = name;
        }

        void walk() {
            System.out.println(name + " is walking!!!");
        }
    }

    static class Son extends Father {
        Son(String name) {
            super(name);
        }

        @Override
        void walk() {
            System.out.println(name + " is walking~~");
        }

        void playBall() {
            System.out.println(name + " is playing ball!");
        }
    }

    static class Daughter extends Father {
        Daughter(String name) {
            super(name);
        }

        @Override
        void walk() {
            System.out.println(name + " is walking@@@");
        }

        void shopping() {
            System.out.println(name + " is shopping!");
        }
    }

    public static void main(String[] args) {
        Father father = new Father("Dad");
        Son son = new Son("Tom");
        Daughter daughter = new Daughter("Amy");

        System.out.println("=== 各自走路 ===");
        father.walk();
        son.walk();
        daughter.walk();

        System.out.println("=== 各自的特有方法 ===");
        son.playBall();
        daughter.shopping();
    }
}
