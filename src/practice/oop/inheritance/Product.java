package practice.oop.inheritance;

public class Product {
    protected int id;
    protected String name;
    protected int price;

    public Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int getDiscount(){
        return (int)(price*0.9);
    }

    public void printInfo(){
        System.out.printf("id: %d, name: %s, price: %d.%n",id, name,price);
    }

}
