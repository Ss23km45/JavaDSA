package util;

import FindSwap.Swapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllNumberMissed {
    public static void main(String[] args) {
        int[] arr = {5,2,4,8,1,4,3,5};
        System.out.println("array missed = " + (missedNumbers(arr)));

    }

    public static List<Integer> missedNumbers(int[] arr){
        int[] arr2 = {};

        Swapping swapping = new Swapping();
        for (int i = 0; i < arr.length ; i++) {
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]) {
                swapping.swap(arr,i,correct);
            }
            else{
                continue;
            }
        }
        List<Integer> ret = new ArrayList<>();
        for (int i = 1; i <= arr.length-1; i++) {
            if(arr[i] != i+1 ){
                ret.add(i);
            }
        }

        return ret;
    }
}
