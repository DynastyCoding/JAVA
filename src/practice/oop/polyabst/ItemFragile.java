package practice.oop.polyabst;

public class ItemFragile extends Item{

    private int fragileLevel;
    public ItemFragile(String name, double weight, int fragileLevel){
        super(name, weight);
        setFragileLevel(fragileLevel);
    }

    public int getFragileLevel(){
        return fragileLevel;
    }

    public void setFragileLevel(int fragileLevel){
        if(fragileLevel>5 || fragileLevel<1){
            this.fragileLevel = 3;
        }else{
            this.fragileLevel = fragileLevel;
        }
    }

    public void pack(){
        System.out.printf("Packing %s, in bubble wrap. Fragile level: %d.%n",name,fragileLevel);
    }

    public void specialHandling(){
        System.out.printf("⚠️Special handling required for %s (level %d).%n",name, fragileLevel);
    }
}
