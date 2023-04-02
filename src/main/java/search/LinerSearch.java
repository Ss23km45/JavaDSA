package search;

public class LinerSearch {
    public static void main(String[] args) {
        int [] arr = {1,4,2,3,5,2,23};
        System.out.println("found at = "  + LinerS(arr, 23));
    }
    static int LinerS(int[] arr, int target){
        //array search

        for (int i = 0; i < arr.length; i++) {
            if(target == arr[i]){
                return i;
            }

        }

        return -1;

    }
}
