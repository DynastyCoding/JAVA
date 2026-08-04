package practice.oop.polyabst;

public class NotifyMain {
    public static void main(String[] args) {
        Notify n1 = new NotifyEmail("john@mail.com", "Hello","Meeting at 3pm");
        Notify n2 = new NotifySMS("John","Hello","0912345678");

        Notify[] notify = {n1,n2};
        for(Notify p : notify){
            p.printMessage();
            p.send();
            System.out.println();
        }

        System.out.println("Subject: " + ((NotifyEmail) n1).getSubject());
        System.out.println("Phone Number: " +((NotifySMS) n2).getPhoneNumber() );
    }
}
