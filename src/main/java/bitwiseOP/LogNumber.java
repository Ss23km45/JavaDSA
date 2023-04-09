package bitwiseOP;


public class LogNumber {
    public static void main(String[] args) {
        int N = 76;
        int b = 2;

        //Will Return the count of the binary digits of the number
        System.out.println((((int)(Math.log(N)/Math.log(b))) + 1));

        System.out.println(Integer.toBinaryString(N));
    }

}
