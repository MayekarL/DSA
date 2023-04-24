package arrays;

import java.util.HashMap;

public class findUniqueElements {

    public static void main(String[] args) {
        int arr[] = {2,4,7,2,7};
        myFindUnique(arr);
        CodeFindUnique(arr);
    }

    //MySolution
    public static int myFindUnique(int[] arr){
        //Your code goes here
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            System.out.println(i+" : "+map.containsKey(i));
            if(map.containsKey(i)){
                int value = map.get(i) + 1;
                map.put(i,value);
            }else{
                map.put(i,0);
            }
            System.out.println("Map : "+map);
        }
        Integer value = 0;
        for(Integer i : map.keySet()){
            if(map.get(i) == 0){
                value = i;
                break;
            }
        }
        System.out.println(value);
        return value;
    }

    //Theirs Optimized Solution
    public static int CodeFindUnique(int[] arr){
        int ans = 0;
        for(int i : arr){
            ans ^= i;
        }
        System.out.println(ans);
        return ans;
    }
}
