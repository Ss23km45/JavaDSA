package bitwiseOP;

public class XorMagic {
    public static void main(String[] args) {
        int N= 5;
        System.out.println(xorMagicinBit(N));
    }
    public static int xorMagicinBit(int N){
        if(N%4 == 0){
            return N;
        }

        if(N%4 == 1){
            return 1;
        }

        if(N%4 == 2){
            return N+1;
        }

        return 0;
    }
}
