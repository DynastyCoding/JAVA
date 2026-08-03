package practice.OOP.Inheritance;

public class EmpManager extends Employee{

    private int teamSize;

    public EmpManager(String name, String department,int teamSize){
        super(name, department);
        setTeamSize(teamSize);
    }

    public int getTeamSize(){
        return teamSize;
    }

    public void setTeamSize(int teamSize){
        if(teamSize<0){
            this.teamSize = 0;
        }else{
            this.teamSize = teamSize;
        }
    }

    @Override
    public void checkIn(){
        super.checkIn();
        System.out.println(name + " checking team progress.");
    }

    @Override
    public void work(){
        System.out.println(name + " is meeting and managing team.");
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("team size: " + teamSize);
    }


}
