package practice.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class StudentScore {

    private Map<String, Integer> scoreMap = new HashMap<>();

    public void addOrUpdateScore(String studentId, int score){
        scoreMap.put(studentId, score);
    }

    public int getScore(String studentId){
        if(scoreMap.containsKey(studentId)){
            return scoreMap.get(studentId);
        }else{
            return -1;
        }
    }

    public boolean removeStudent(String studentId){
        if(scoreMap.containsKey(studentId)){
            scoreMap.remove(studentId);
            return true;
        }else{
            return false;
        }
    }

    public int getTotalStudents(){
        return scoreMap.size();
    }

    public double getAverageScore(){
        if(scoreMap.isEmpty()){
            return 0;
        }

        int total = 0;
        for(String id: scoreMap.keySet()){
            total+= scoreMap.get(id);
        }
        return (double)total/scoreMap.size();
    }

    public String getTopStudent(){
        if(scoreMap.isEmpty()){
            return null;
        }

        String topId = null;
        int topScore = -1;

        for(String id: scoreMap.keySet()){
            int score = scoreMap.get(id);

            if(score>topScore){
                topScore = score;
                topId = id;
            }
        }
        return topId;
    }

    public void printAllScores(){
        if(scoreMap.isEmpty()){
            System.out.println("No students.");
        }else{
            for(Map.Entry<String, Integer> entry: scoreMap.entrySet()){
                System.out.println(entry.getKey() + "->" + entry.getValue());
            }
        }
    }

}
