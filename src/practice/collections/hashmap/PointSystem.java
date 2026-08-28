package practice.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class PointSystem {

    private Map<String, Integer> points = new HashMap<>();

    public void addOrUpdatePoints(String id, int point){
        if(points.containsKey(id)){
            points.put(id, points.get(id) + point);
        }else{
            points.put(id,point);
        }
    }

    public int getPoint(String id){
        if(points.containsKey(id)){
            return points.get(id);
        }else{
            System.out.println("Invalid member id.");
            return -1;
        }
    }

    public void pointDiscount(String id, int discountAmount){
        if(!points.containsKey(id)){
            System.out.println("Invalid member id.");
        }else if(points.get(id)<=discountAmount){
            System.out.println("Insufficient points.");
        }else{
            points.put(id, points.get(id)-discountAmount);
        }
    }

    public void deleteMember(String id){
        if(points.containsKey(id)){
            points.remove(id);
        }else{
            System.out.println("Invalid member id.");
        }
    }

    public int getMemberNumbers(){
        return points.size();
    }

    public void printAll(){
        if(points.isEmpty()){
            System.out.println("No members.");
        }else{
            for(String id: points.keySet()){
                System.out.println(id + ": " + points.get(id));
            }
        }
    }
}
