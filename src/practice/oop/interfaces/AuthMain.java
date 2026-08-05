package practice.oop.interfaces;

public class AuthMain {
    public static void main(String[] args) {
        Authenticatable[] auths = { new AuthLocal("admin", "12345"),
                                    new AuthGuest()
        };

        for (Authenticatable a : auths) {
            System.out.println("Verification result: " + a.verify("admin", "12345"));
            System.out.println("Auth type: " + a.getAuthType());
            System.out.println();
        }

        System.out.println("Max attempts: " + Authenticatable.MAX_ATTEMPTS);
        Authenticatable.showAuthPolicy();
    }
}
