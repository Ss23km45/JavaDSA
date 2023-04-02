package findSwap;

public class Swapping {
    public static void main(String[] args) {

    }
    public static void swap(int[] arr,int start, int end){
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
    }
}
