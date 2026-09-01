package practice.exception;

public class LoginService {

    public String login(String memberId, String password){
        if(!memberId.equals("A123456789") || !password.equals("pass1234")){
            throw new AuthenticationException("Invalid memberId or password.");
        }
        return "Login successful.";
    }
}
