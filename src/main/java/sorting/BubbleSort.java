package sorting;

import search.BinarySearch;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,5,2,4,8,3,8,5,9,4,1,97,7,3,46,2346,7674,54,243,};
        BSort(arr);
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
