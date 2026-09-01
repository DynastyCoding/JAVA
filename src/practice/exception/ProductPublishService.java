package practice.exception;

public class ProductPublishService {

    public boolean validateName(String name){
        if(name == null || name.isEmpty() || name.length()>50){
            throw new IllegalArgumentException("Invalid product name.");
        }
        return true;
    }

    public boolean validatePrice(int price){
        if(price<=0){
            throw new IllegalArgumentException("Invalid product price.");
        }
        return true;
    }

    public String publish(String name, int price){
        try{
            validateName(name);
            validatePrice(price);
            return "Product published.";
        }catch(IllegalArgumentException e){
            return e.getMessage();
        }finally{
            System.out.println("Publish process finished.");
        }
    }
}
