package practice.oop.encapsulation;

public class Member {
    private final String id;
    private String name;
    private int level;
    private int points;

    public Member(String id, String name, int level, int points){
        this.id = id;
        setName(name);

       setLevel(level);

        if(points<0){
            System.out.println("Point can't less than zero.");
        }else{
            this.points = points;
        }
    }

    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getLevel(){
        return level;
    }

    public int getPoints(){
        return points;
    }

    public void setName(String name){
        if(name == null || name.isEmpty()){
            this.name = "unknown member";
        }else{
            this.name = name;
        }
    }

    public void setLevel(int level){
        if(level<1 || level>5){
            this.level = 1;
        }else{
            this.level = level;
        }
    }

    public void addPoints(int amount){
        if(amount<=0){
            System.out.println("Add points need to more than 0.");
            return;
        }
        points+=amount;
    }

    public void usePoints(int amount){
        if (amount <= 0) {
            System.out.println("使用點數必須大於 0");
            return;
        }
        if (amount > points) {
            System.out.println("點數不足");
            return;
        }
        points -= amount;
    }

    public void checkLevelUp(){
        level = Math.min(points/100+1,5);
    }

    public void printInfo(){
        System.out.printf("id: %s, name: %s, level: %d, points: %d",id,name,level,points);
    }

}
