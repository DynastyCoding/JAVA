package practice.oop.interfaces;

public class AuthLocal implements Authenticatable{

    private String username;
    private String password;

    public AuthLocal(String username, String password){
        if(username == null || username.isEmpty()){
            this.username = "default";
        }else{
            this.username = username;
        }

        if(password == null || password.isEmpty()){
            this.password = "default";
        }else{
            this.password = password;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean verify(String username, String password){
        if (this.username.equals(username) && this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }

    public String getAuthType(){
        return "Local";
    }
}
