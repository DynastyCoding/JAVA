package practice.OOP.Inheritance;

public class Employee {

    protected String name;
    protected String department;

    public Employee(String name, String department){
        setName(name);
        setDepartment(department);
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public void setName(String name){
        if(name == null||name.isEmpty()){
            this.name = "unknown";
        }else{
            this.name = name;
        }
    }

    public void setDepartment(String department){
        if(department == null||department.isEmpty()){
            this.department = "unknown department";
        }else{
            this.department = department;
        }
    }

    public void checkIn(){
        System.out.println(name + " clocking in to work.");
    }

    public void work(){
        System.out.println(name + " is working.");
    }

    public void printInfo(){
        System.out.printf("employee: %s, department: %s.%n",name,department);
    }


}
