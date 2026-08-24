package practice.advanced.collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeReport {

    private Map<String, Integer> gradeMap = new HashMap<>();

    public void addOrUpdateGrade(String studentId, int grade){
        gradeMap.put(studentId, grade);
    }

    public List<String> getPassingStudents(){
        List<String> passing = new ArrayList<>();

        for(String id : gradeMap.keySet()){
            if(gradeMap.get(id)>=60){
                passing.add(id);
            }
        }
        return passing;
    }

    public double getAverage(){
        if(gradeMap.isEmpty()){
            return 0;
        }
        int total = 0;
        for(String id : gradeMap.keySet()){
            total += gradeMap.get(id);
        }

        return (double)total/gradeMap.size();
    }

    public void printAllGrades(){
        if(gradeMap.isEmpty()){
            System.out.println("No students.");
        }else{
            for(Map.Entry<String, Integer> entry : gradeMap.entrySet()){
                System.out.println(entry.getKey() + "->" + entry.getValue());
            }
        }
    }
}
