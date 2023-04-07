package recursion.arrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,4,3,2,1};
        System.out.println(rotatedBinary(arr,0,arr.length-1, 9));

    }

    static int rotatedBinary(int[] arr, int start, int end, int target){
        if (start > end) {
            return -1;
        }

        int mid = start + (end-start) /2;
        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] >= arr[start]){
            if(target >= arr[start] && target <= arr[mid]) {
                return rotatedBinary(arr, start, mid-1 , target);
            }
            else {
                return rotatedBinary(arr, mid+1, end , target);
            }

        }

        if(target >= arr[mid] || target <= arr[end]) {
            return rotatedBinary(arr, mid+1, end , target);
        }

        return rotatedBinary(arr, start, mid-1 , target);

    }
}
