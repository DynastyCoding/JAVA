package practice.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MemberSpending {

    private Map<String, Integer> map = new HashMap<>();

    public void addSpending(String memberId, int amount){
        if(map.containsKey(memberId)){
            map.put(memberId, map.get(memberId) + amount);
        }else{
            map.put(memberId, amount);
        }
    }

    public int getSpending(String memberId){
        if(map.containsKey(memberId)){
            return map.get(memberId);
        }else{
            return -1;
        }
    }

    public boolean removeMember(String memberId){
        if(map.containsKey(memberId)){
            map.remove(memberId);
            return true;
        }else{
            return false;
        }
    }

    public int getTotalMembers(){
        return map.size();
    }

    public void printAll(){
        for(String key : map.keySet()){
            System.out.println(key + ": $" + String.format("%,d", map.get(key)));
        }
    }
}
