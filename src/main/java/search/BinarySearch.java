package search;


public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,34,45,67,89};
        System.out.println("found at = "  + binarySearch1(arr, 45));
    }

    public static int binarySearch1(int[] arr, int target){
        //Implementing Binary Search
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            else if (arr[mid] < target){
                start = mid+1;
            }
            else if ( arr[mid] > target){
                end = mid-1;
            }
        }


        return -1;
    }

}
