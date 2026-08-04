package practice.oop.polyabst;

public class NotifySMS extends Notify{

    private String phoneNumber;

    public NotifySMS(String recipient, String message, String phoneNumber){
        super(recipient, message);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(){
        System.out.printf("Sending SMS to %s : %s.%n",phoneNumber, message);
    }
}
