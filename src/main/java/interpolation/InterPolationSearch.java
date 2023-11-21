package interpolation;

public class InterPolationSearch {

    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        System.out.println(interpolationSearch(array, 34));
    }

    private static int interpolationSearch(int[] array, int target) {
        int start = 0;
        int end = array.length-1;

        while (start<=end && target>array[start] && target<array[end]){
            int probe = start + (end - start) * (target - array[start]) / (array[end] - array[start]);
            System.out.println("Probe Generating now " + probe);
            if(array[probe] == target){
                return probe;
            } else if (array[probe] < target) {
                start = probe +  1;
            }else {
                end = probe - 1;
            }
        }

        return -1;
    }
}
