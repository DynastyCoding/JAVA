package practice.oop.polyabst;

public abstract class Notify {

    protected String recipient;
    protected String message;

    public Notify(String recipient, String message){
        setRecipient(recipient);
        setMessage(message);
    }

    public String getRecipient(){
        return recipient;
    }

    public String getMessage(){
        return message;
    }

    public void setRecipient(String recipient){
        if(recipient == null || recipient.isEmpty()){
            this.recipient = "unknown";
        }else{
            this.recipient = recipient;
        }
    }

    public void setMessage(String message){
        if(message == null || message.isEmpty()){
            this.message = "unknown";
        }else{
            this.message = message;
        }
    }

    public abstract void send();

    public void printMessage(){
        System.out.println("Message: " + message);
    }
}
