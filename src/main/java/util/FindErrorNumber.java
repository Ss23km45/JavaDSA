package util;

import findSwap.Swapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindErrorNumber {
    public static Swapping swapping = new Swapping();
    public static void main(String[] args) {
        int[] arr = {5,2,7,2,8,1,3,6};
        System.out.println(errorNumber(arr));
    }

    static List<Integer> errorNumber(int[] arr){
        List<Integer> error = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            int correct = arr[i] -1;
            if(arr[i] == arr[correct]){
                continue;
            }
            else{
                swapping.swap(arr,i,correct);
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                error.add(arr[i]);
                error.add(i+1);
                break;
            }
        }
        return error;
    }
    }
