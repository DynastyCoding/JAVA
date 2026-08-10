package practice.advanced.collections.ArrayList;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks = new ArrayList<>();

    public void addTask(String task){
        if(task != null && !task.isEmpty()){
            tasks.add(task);
        }
    }

    public boolean completeTask(String task){
        return tasks.remove(task);
    }

    public void removeTask(int index){
        if(index>=0 && index<tasks.size()){
            tasks.remove(index);
        }
    }

    public String getTask(int index){
        if(index<0 || index>=tasks.size()){
            return null;
        }else{
            return tasks.get(index);
        }
    }

    public int getTotalTasks(){
        return tasks.size();
    }

    public void printTasks(){
        if(tasks.isEmpty()){
            System.out.println("No pending tasks.");
        }else{
            for(int i = 0; i<tasks.size(); i++){
                System.out.printf(" %d. %s%n",i+1,tasks.get(i));
            }
        }
    }

    public void printTaskWithKeyword(String keyword){
        for(int i =0; i<tasks.size();i++){
            if(tasks.get(i).contains(keyword)){
                System.out.printf("%d. %s%n",i+1,tasks.get(i));
            }
        }
    }

    public void clear(){
        tasks.clear();
    }

    public static void main(String[] args) {
        TodoList todo = new TodoList();

        todo.addTask("buy milk");
        todo.addTask("write reports");
        todo.addTask("go to the gym");
        todo.addTask("pay utility bills");
        todo.addTask("reply emails");
        todo.printTasks();

        todo.completeTask("write reports");
        todo.printTasks();

        todo.removeTask(2);
        todo.printTasks();

        todo.printTaskWithKeyword("buy");
        System.out.println("Todo counts: " +  todo.getTotalTasks());

    }
}
