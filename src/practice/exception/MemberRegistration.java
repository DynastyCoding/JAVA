package practice.exception;

public class MemberRegistration {

    public boolean validateEmail(String email){
        if(email == null || email.isEmpty() || !email.contains("@")){
            throw new IllegalArgumentException("Invalid email format.");
        }
        return true;
    }

    public boolean validatePassword(String password){
        if(password == null || password.isEmpty() || password.length()<8){
            throw new IllegalArgumentException("Password must be at least 8 characters.");
        }
        return true;
    }

    public String register(String email, String password){
        try{
            validateEmail(email);
            validatePassword(password);
            return "Registration successful.";
        }catch(IllegalArgumentException e){
            return e.getMessage();
        }finally{
            System.out.println("Registration process finished.");
        }
    }
}
