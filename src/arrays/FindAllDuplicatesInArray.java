package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesInArray {

    public static void main(String[] args) {

        int nums[] = {1,2,3,4,6,7,4,2,3};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                ans.add(i);
            }
        }
        return ans;
    }
}
