package util;

import FindSwap.Swapping;

import java.util.Arrays;

public class RepeatedElement {
    static Swapping swapping = new Swapping();
    public static void main(String[] args) {
        int[] arr = {5,2,7,4,8,8,1,6};
        System.out.println("Repeated Number = " + missedNumber(arr));
    }

    public static int missedNumber(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int correct = arr[i] - 1;
            if(arr[i] == arr[correct]){
                continue;
            }
            else{
                swapping.swap(arr,i,correct);
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
