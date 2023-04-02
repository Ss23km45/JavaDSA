package util;

import findSwap.Swapping;

import java.util.Arrays;

public class MissingPositiveNumber {
    public static Swapping sap = new Swapping();
    public static void main(String[] args) {
        int[] arr = {5,2,5,4,8,1,-1,6};
        System.out.println(missingNumber(arr));
    }

    static int missingNumber(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int cyc = arr[i] -1;
            if(arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[cyc]){
                sap.swap(arr, i, cyc);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int cyc = arr[i] -1;
            if(arr[i] >0 && arr[i] != i+1){
                return i+1;
            }
        }
        System.out.println(Arrays.toString(arr));

        return arr.length + 1;
    }
}
