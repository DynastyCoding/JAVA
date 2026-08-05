package practice.oop.interfaces;

public class CancelMonthly implements Cancellable{

    private final String planName;

    private final double monthlyPrice;

    private String startDate;

    public CancelMonthly(String planName, double monthlyPrice, String startDate) {

        if(planName == null || planName.isEmpty()){
            this.planName = "Monthly Plan";
        }else{
            this.planName = planName;
        }

        if(monthlyPrice<0){
            this.monthlyPrice = 0;
        }else{
            this.monthlyPrice = monthlyPrice;
        }
        this.startDate = startDate;
    }

    public String getPlanName() {
        return planName;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double calculateRefund(int daysUsed){
        double result = monthlyPrice*(1-daysUsed/30.0);
        if(result<0){
            return 0;
        }else{
            return result;
        }
    }

    public void cancel(int daysUsed){
        System.out.printf("Monthly plan %s cancelled. Refund $%.2f.%n",planName, calculateRefund(daysUsed));
    }
}
