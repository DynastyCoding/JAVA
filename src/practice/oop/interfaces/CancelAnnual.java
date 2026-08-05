package practice.oop.interfaces;

public class CancelAnnual implements Cancellable{

    private final String planName;

    private final double annualPrice;

    private String startDate;

    public CancelAnnual(String planName, double annualPrice, String startDate) {

        if(planName==null||planName.isEmpty()){
            this.planName = "AnnualPrice";
        }else{
            this.planName = planName;
        }

        if(annualPrice<0){
            this.annualPrice = 0;
        }else{
            this.annualPrice = annualPrice;
        }
        this.startDate = startDate;
    }

    public String getPlanName() {
        return planName;
    }

    public double getAnnualPrice() {
        return annualPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public double calculateRefund(int daysUsed){
        double result = annualPrice*(1-daysUsed/365.0);

        if(result<0){
            return 0;
        }else{
            return result;
        }
    }

    public void cancel(int daysUsed){
        System.out.printf("Annual plan %s cancelled. Refund: $%.2f.%n",planName,calculateRefund(daysUsed));
    }
}
