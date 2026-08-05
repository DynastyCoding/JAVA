package practice.oop.interfaces;

public interface Cancellable {

    double calculateRefund(int dayUsed);

    void cancel(int daysUsed);

    static void showCancellationPolicy(){
        System.out.println("Cancellation fee applies within 30 days.");
    }

    int MINIMUM_SUBSCRIPTION_DAYS = 30;

}
