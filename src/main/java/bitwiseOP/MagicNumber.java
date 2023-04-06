package bitwiseOP;

public class MagicNumber {
    public static void main(String[] args) {
        int n = 8;
        int base =5;
        int sum = 0;

        //basedon base we gave it will give the respective base number
        while (n>0){
            int last = n&1;
            n = n >> 1;
            sum += last * base;

            base = base*5;

        }

        System.out.println(sum);

        System.out.println((Math.pow(5,2)));
    }
}
