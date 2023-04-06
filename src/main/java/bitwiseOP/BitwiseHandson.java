package bitwiseOP;

public class BitwiseHandson {
    public static void main(String[] args) {
        andOper(8);
        int[] arr= {1,4,2,3,5,2,3,1,4};
        System.out.println(xorOper(arr));
        System.out.println(0 ^ 1);
        findithbit(5);
    }

    private static void andOper(int i) {
        System.out.println((i & 1) == 1 ? "Odd Number" : "Even Number");
    }


    private static int xorOper(int[ ] arr) {
        int xor = 0;
        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }

        return xor;
    }

    private static void findithbit(int Number){
        System.out.println(Number & (1<< (Number-1)));
    }
}
