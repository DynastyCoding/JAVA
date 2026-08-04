package practice.oop.encapsulation;

public class Temperature {
    private String city;
    private double temp;

    public Temperature(String city, double temp) {
        this.city = city;
        if (temp >= -50 && temp <= 50) {
            this.temp = temp;
        } else {
            this.temp = 0;
            System.out.println("Invalid temperature, set to 0.");
        }
    }

    public String getCity(){
        return city;
    }

    public double getTemp(){
        return temp;
    }

    public void setTemp(double temp){
        if(temp>=-50&&temp<=50){
            this.temp=temp;
        }else{
            this.temp=0;
            System.out.println("Invalid temperature, set to 0.");
        }
    }

    public void printInfo(){
        System.out.println(city + " | " + temp + "°C");
    }
    public double toFahrenheit(){
        double f = temp*9/5+32;
        return f;
    }

    public boolean isHot(){
        if(temp>30){
            return true;
        }else{
            return false;
        }
    }

}
