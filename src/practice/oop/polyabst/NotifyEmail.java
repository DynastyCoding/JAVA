package practice.oop.polyabst;

public class NotifyEmail extends Notify{

    private String subject;

    public NotifyEmail(String recipient, String message, String subject){
        super(recipient, message);
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    @Override
    public void send(){
        System.out.printf("Sending email to %s: %s - %s.%n",recipient, subject, message);
    }

    @Override
    public void printMessage(){
        System.out.println("Subject: " + subject);
        super.printMessage();
    }


}
