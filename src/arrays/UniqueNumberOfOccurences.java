package arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurences {

    public static void main(String[] args) {

    }
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> check = new HashMap<>();
        int size = arr.length;
        map.put(arr[0],1);
        for(int i=1;i < size;i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i]) + 1;
                map.put(arr[i],value);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Integer key : map.keySet()){
            if(!check.containsKey(map.get(key))){
                check.put(map.get(key),map.get(key));
            }else{
                return false;
            }
        }
        return true;
    }
}
