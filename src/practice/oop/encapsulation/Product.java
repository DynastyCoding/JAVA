package practice.oop.encapsulation;

public class Product {

    private final String id;
    private String name;
    private int price;
    private int stock;

    public Product(String id, String name, int price, int stock){
        this.id = id;
        this.name = name;
        setPrice(price);

        if(stock<0){
            this.stock = 0;
        }else{
            this.stock = stock;
        }
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public int getStock(){
        return stock;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        if(price<=0){
            this.price = 100;
        }else{
            this.price = price;
        }
    }

    public void reduceStock(int amount){
        if(stock<amount){
            System.out.println("Error: Insufficient stock.");
        }else{
            stock-=amount;
            System.out.printf("Remaining inventory: %d.", stock);
        }
    }

    public void printInfo(){
        System.out.printf("id: %s, name: %s, price: %d, stock: %d.",id,name,price,stock);
    }

}
