package bitwiseOP;

public class NumberofDigits {

    public static void main(String[] args) {
        int N = 3628253;
        int base = 2;
        int onecount =0 , zerocount =0;

        System.out.println(Integer.toBinaryString(N));

        while(N>0){
            if ((N & 1) == 1) {
                onecount++;
            } else {
                zerocount++;
            }
            N = N >> 1;
        }

        System.out.println("Zero " + zerocount + " One Count " + onecount);
    }
}
