package Search;

import java.util.Arrays;

public class BinarySearch2D {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println("found at = "  + Arrays.toString(binarySearch2D1(arr, 45)));
    }

    static int[] binarySearch2D1(int[][] arr, int target) {
        int upperBound = arr[0].length-1;
        int lowerBound = 0;

        while(lowerBound < arr.length && upperBound >= 0) {
            if (target == arr[lowerBound][upperBound]) {
                return new int[]{lowerBound, upperBound};
            } else if (target > arr[lowerBound][upperBound]) {
                lowerBound++;
            } else if (target < arr[lowerBound][upperBound]) {
                upperBound--;
            }
        }
        return new int[]{-1,-1};
    }

}
