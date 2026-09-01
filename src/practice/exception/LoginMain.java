package practice.exception;

public class LoginMain {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();

        try {
            System.out.println(loginService.login("A123456789", "pass1234"));
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(loginService.login("B123456789", "pass1234"));
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(loginService.login("A123456789", "wrongpass"));
        } catch (AuthenticationException e) {
            System.out.println(e.getMessage());
        }
    }
}