package practice.oop.polyabst;

public abstract class Item {

    protected String name;
    protected double weight;

    public Item(String name, double weight){
        setName(name);
        setWeight(weight);
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            this.name = "unknown";
        }else{
            this.name = name;
        }
    }

    public void setWeight(double weight){
        if(weight<=0){
            this.weight = 1;
        }else{
            this.weight = weight;
        }
    }

    public abstract void pack();

    public void printLabel(){
        System.out.printf("Item: %s, weight: %.1f.%n",name, weight);
    }
}
