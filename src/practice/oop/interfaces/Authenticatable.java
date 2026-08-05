package practice.oop.interfaces;

public interface Authenticatable {

    boolean verify(String username, String password);

    String getAuthType();

    static void showAuthPolicy(){
        System.out.println("Policy: Maximum 3 login attempts.");
    }

    int MAX_ATTEMPTS = 3;
}
