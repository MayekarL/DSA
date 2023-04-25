package arrays;

import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {

    public static void main(String[] args) {
// https://www.codingninjas.com/codestudio/problems/intersection-of-2-arrays_1082149?source=youtube&campaign=love_babbar_codestudio1&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio1&leftPanelTab=1



    }

    public static ArrayList<Integer> findArrayIntersection(
            ArrayList<Integer> arr1, int n,
            ArrayList<Integer> arr2, int m)
    {
        // Write Your Code Here.
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i < n;i++){
            for(int j = 0;j < m;j++){
                if(arr1.get(i) == arr2.get(j)){
                    result.add(arr1.get(i));
                    arr2.set(j, -111111);	//
                    break;
                }
            }
        }
        if(result.size() == 0){
            result.add(-1);
        }
        return result;
    }

    /*
    Below approach is known as Pointers
     */
    public static ArrayList<Integer> findArrayIntersectionOpti(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
    {
        // Write Your Code Here.
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0,j=0;

        while(i < n && j < m){

            if (arr1.get(i) < arr2.get(j)){
                i++;
            }else if (arr1.get(i) > arr2.get(j)){
                j++;
            }
            else {
                ans.add(arr1.get(i));
                i++;
                j++;
            }

        }
        if(ans.size() == 0){
            ans.add(-1);
        }
        return ans;
    }

}
