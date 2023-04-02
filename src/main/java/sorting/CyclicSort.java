package sorting;

import findSwap.Swapping;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,2,7,4,8,1,3,6};
        cyclicSorting(arr);

    }
    public static void cyclicSorting(int[] arr){
        Swapping swapping = new Swapping();
        for (int i = 0; i < arr.length ; i++) {
            int correct = arr[i] -1;
            if(arr[i] == arr[correct]){
                continue;
            }
            else{
               Swapping.swap(arr,i,correct);
            }
        }

        System.out.println("arr = " + Arrays.toString(arr));
    }
}