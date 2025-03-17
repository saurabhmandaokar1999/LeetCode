import java.util.HashMap;  
import java.util.Map;  
  
class Solution {  
    public boolean divideArray(int[] nums) {  
        Map<Integer, Integer> map = new HashMap<>();  
        int len = nums.length;  
  
        for (int i : nums) {  
            map.put(i, map.getOrDefault(i, 0) + 1); 
        }  
   
        for (int count : map.values()) {  
            if (count % 2 != 0) return false;  
        }  
  
        return true;  
    }  
}  