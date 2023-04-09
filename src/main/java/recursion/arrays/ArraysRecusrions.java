package recursion.arrays;

import java.util.ArrayList;

public class ArraysRecusrions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {1,2,3,4,5,23,5,6,23,23,56,34,2,42,2,6352,2,2,34,47,2};
        System.out.println(isSorted(arr,0));
        isFound(arr2,2, 0);
        System.out.println(arrayList);

    }

    public static boolean isSorted(int[] arr, int index){
        if(index >= arr.length-1){
            return true;
        }
        return ((arr[index] < arr[index+1]) && (isSorted(arr, index+1)));
    }

    static ArrayList<Integer> arrayList = new ArrayList<Integer>();


    public  static void isFound(int[] arr, int target, int index){
        if(arr[index]==target){
            arrayList.add(index);
        }

       if(index == arr.length-1)
        {
           return;
        }

       isFound(arr,target,index+1);



    }
}
