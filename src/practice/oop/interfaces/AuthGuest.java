package practice.oop.interfaces;

public class AuthGuest implements Authenticatable{

    public boolean verify(String username, String password){
        if(username == null || username.isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    public String getAuthType(){
        return "Guest";
    }

}
