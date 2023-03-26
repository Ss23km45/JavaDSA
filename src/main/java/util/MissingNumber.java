package util;

import FindSwap.Swapping;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {5,2,7,4,8,1,6};
        System.out.println("Value = " + missedNumber(arr) );
    }
    //Given an array we have to find out the missing number in that array. [0,n]
    //Based on array range we find out tthat n+1 numbers should present.

   /* static int missedNumber(int[] arr)
    {   int num;

        return num;
    } */

    public static int missedNumber(int[] arr){
        Swapping swapping = new Swapping();
        for (int i = 0; i < arr.length ; i++) {
            int correct = arr[i]-1;
            if(arr[i]< arr.length && arr[i] != arr[correct]) {
                swapping.swap(arr,i,correct);
            }
            else{
                continue;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1 ){
                return i+1;
            }
        }


        return arr.length;
    }

}
