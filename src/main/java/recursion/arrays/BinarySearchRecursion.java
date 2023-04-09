package recursion.arrays;

import java.util.ArrayList;

public class BinarySearchRecursion {
    private static ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public static void main(String[] args) {
        int[] arr2 = {1,5,5,4,5,23,34,5,67,5,78,5,90};
        int[] arr = {1,2,3,4,5,6,7,8,9};
       System.out.println(isFound(arr2, 5, new ArrayList<>(), 0));
        System.out.println(isFound(arr2, 5, 0));
        System.out.println(isFound(arr, 9, 0,arr2.length-1));
    }

 public static int isFound(int[] arr, int target, int s, int e){
        int mid = s + (e-s) /2;
        if(arr[mid] == target){
            return mid;
        }

        if(target >= arr[mid]){
            s = mid + 1;
        }
        else{
            e = mid-1;
        }

        if(0 >= mid || mid >= arr.length){
            return -1;
        }

        return isFound(arr, target, s, e);

    }

    public static ArrayList<Integer> isFound(int[] arr, int target, ArrayList<Integer> List, int counter){


        if(counter == arr.length-1){
            return List;
        }

        if(arr[counter] == target){
            List.add(counter);
        }

        return isFound(arr, target, List, counter+1);
    }

    public static ArrayList<Integer> isFound(int[] arr, int target, int counter){


        if(counter == arr.length-1){
            return arrayList;
        }

        if(arr[counter] == target){
            arrayList.add(counter);
        }

        return isFound(arr, target, counter+1);
    }

}
