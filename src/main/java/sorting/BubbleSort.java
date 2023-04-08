package sorting;

import search.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,2,4,8,3};
        BSort(arr);
        String str = "d,hk,bia,ov,b,f,v";
        String[] arr2 = str.split(",");
        //Arrays.copyOfRange();
        System.out.println(Arrays.toString(arr2));
        //System.out.println(arr2.Contains());

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch1(arr, 2346));
    }
    public static int[] BSort(int[] arr)
    {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        }

        return arr;
    }
}
