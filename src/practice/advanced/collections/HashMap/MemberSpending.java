package practice.advanced.collections.HashMap;

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
        }
    }



}
