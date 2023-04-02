package sorting;

import findSwap.Swapping;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {2,5,2,4,8,3,8,5,9,4,1,97,7,3,46,2346,7674,54,243,};
        Insertionsort(arr);
        System.out.println("args = " + Arrays.toString(arr));
    }

    public static void Insertionsort(int[] arr) {
        Swapping swapping = new Swapping();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {

                    swapping.swap(arr, j, j-1);
                    /*int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp; */
                } else {
                    break;
                }
            }
        }

    }
}
