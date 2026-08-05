package practice.oop.interfaces;

public class CancelMain {
    public static void main(String[] args) {

        Cancellable[] cancel = {new CancelMonthly("Basic",9.99,"2026-07-01"),
                                new CancelAnnual("Premium", 191.88,"2026-01-01")
        };

        for(Cancellable c: cancel){
            if(c instanceof CancelMonthly){
                c.cancel(15);
            }else if(c instanceof CancelAnnual){
                c.cancel(120);
            }
        }

        System.out.println(Cancellable.MINIMUM_SUBSCRIPTION_DAYS);

        Cancellable.showCancellationPolicy();

    }
}
