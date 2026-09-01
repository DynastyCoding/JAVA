package practice.exception;

public class MemberMain {
    public static void main(String[] args) {
        MemberRegistration registration = new MemberRegistration();

        // 1. 合法
        System.out.println(registration.register("duke@test.com", "password123"));

        // 2. email 不合法
        System.out.println(registration.register("duke", "password123"));

        // 3. 密碼太短
        System.out.println(registration.register("duke@test.com", "123"));

    }
}
