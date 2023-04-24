package arrays;

public class SwapAlternate {

    /*
        input  - [1 , 2 , 3 , 4 , 5]
        output - [2 , 1 , 4 , 3 , 5]
     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5 , 6};

   //     mySwap(arr);
        codeSwap(arr,arr.length);

    }

    private static void codeSwap(int[] arr,int size) {

        for(int i = 0;i < size;i+=2){
            if(i+1 < size){
               int temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;

            }
        }
        System.out.println();
        printArr(arr);
    }

    private static void mySwap(int[] arr) {

        int size = arr.length;   // 4     0 1 2 3
        int[] newArr = new int[size];
        int count = 0;

        boolean checkLastElement = size % 2 != 0;
        for (int i = 0; i < size; i++) {   // i = 2
            if (count == 2) {
                count = 0;
            }
            if(checkLastElement && i == (size - 1)){
                newArr[i] = arr[i];
            }else if (count == 0) {
                newArr[i] = arr[i + 1];    // 2
                count++;
            } else if (count == 1) {
                newArr[i] = arr[i - 1];    // 1
                count++;
            }
        }
        System.out.println("Before : ");
        printArr(arr);
        System.out.println();
        printArr(newArr);
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
