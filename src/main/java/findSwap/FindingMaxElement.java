package findSwap;

import sorting.BubbleSort;

public class FindingMaxElement {
    public static void main(String[] args) {
        //there are To ways to find out the larget element in an array
        //1. Sort it and print last elemet
        int[] arr2 = {2,5,2,4,8,3,44453,5,9,4,1,97,7,3,46,2346,7674,54,243,};
        BubbleSort bubbleSort = new BubbleSort();
        int[] ans = bubbleSort.BSort(arr2);
        System.out.println("Using Sorting Max Elemnt = " + ans[ans.length-1] );

        //2. Use forloop and find it
        int[] arr = {2,5,2,4,8,3,44453,5,9,4,1,97,7,3,46,2346,7674,54,243,};
        maxElement(arr);
    }
    public static int maxElement(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max Element = " + max);

        return max;
    }

    public static int maxElement(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        System.out.println(max);
        return max;
    }
}
