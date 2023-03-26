package Sorting;

import servers.FindingMaxElement;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {2,5,2,4,8,3,8,5,9,4,1,97,7,3,46,2346,7674,54,243,};
        Selectionsort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }

    public static void Selectionsort(int[] arr) {
        FindingMaxElement findingMaxElement = new FindingMaxElement();
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i -1;
            //MaxElement will return index of Max Number/Char in an array
            // we have to swap it with last len-i element based on current iteration
            int inder = findingMaxElement.maxElement(arr, 0, end);
            int temp = arr[inder];
            arr[inder] = arr[end];
            arr[end] = temp;
        }
    }

}
