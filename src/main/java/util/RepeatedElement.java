package util;

import FindSwap.Swapping;

import java.util.Arrays;

public class RepeatedElement {
    static Swapping swapping = new Swapping();
    public static void main(String[] args) {
        int[] arr = {5,2,7,4,8,3,3,6};
        System.out.println("Repeated Number = " + missedNumber(arr));
    }

    public static int missedNumber(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int correct = arr[i];
            if(arr[i] <= arr.length && arr[i] != arr[correct]) {
                swapping.swap(arr,i,correct);
            }
            else{
                continue;
            }
        }
        System.out.println("arr = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1 ){
                return arr[i];
            }
        }


        return arr.length;
    }
}
