package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicatesInAnArray {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(4);
        System.out.println(opti(nums));
        System.out.println(hsApproach(nums));
    }

    private static int  hsApproach(ArrayList<Integer> nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(Integer i : nums){
            if(!set.contains(i)){
                set.add(i);
            }else{
                ans = i;
                return ans;
            }
        }
        return ans;
    }

    public static int findDuplicate(ArrayList<Integer> arr) {
        int ans = -1;
        //    Write your code here.
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i; j < arr.size(); i++) {
                if (arr.get(i) == arr.get(j)) {
                    ans = arr.get(i);
                    i = arr.size();
                    j = arr.size();
                }
            }
        }
        return ans;
    }

    public static int opti(ArrayList<Integer> arr) {
        int ans = 0;
        for (Integer i : arr) {
            System.out.println("1st Loop : "+ans +" ^ "+ i +" : "+(ans ^ i));
            ans = ans ^ i;
        }

        for (int i = 1; i < arr.size(); i++) {
            System.out.println("2nd Loop : "+ans +" ^ "+ i +" : "+(ans ^ i));
            ans = ans ^ i;
        }
    return ans;
    }


}