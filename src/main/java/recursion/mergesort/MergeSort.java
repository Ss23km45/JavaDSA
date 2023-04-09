package recursion.mergesort;

import java.util.Arrays;

/*
Merge Sort is the Technique whihc e use to divide he array in half and sort
the divided arrays and merge those

 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,2,9,20,25,3,34};
        int[] arr2 = {};

        System.out.println(Arrays.toString(divideArray(arr)));
    }

    static int[] divideArray(int[] arr){
        if(arr.length ==1){
            return arr;
        }

        int mid = arr.length/2;

        int[]  left = divideArray(Arrays.copyOfRange(arr,0, mid));
        int[] right =  divideArray(Arrays.copyOfRange(arr,mid, arr.length));

        return MergeArray(left, right);
    }

    static int[] MergeArray(int[] left, int[] right){

        int l =0;
        int r = 0;
        int k =0;
        int[] arr = new int[left.length + right.length];

        while(l < left.length && r < right.length){
            if(left[l] < right[r]){
                arr[k] = left[l];
                l++;
            }else {
                arr[k] = right[r];
                r++;
            }
            k++;
        }
     //Possible that one array length might me high compared to another so we have to append remaining
     //elements since it is already sorted.
        while(l < left.length){
            arr[k] = left[l];
            k++;
            l++;
        }

        while(r < right.length){
            arr[k] = right[r];
            k++;
            r++;
        }



        return arr;
    }
}

