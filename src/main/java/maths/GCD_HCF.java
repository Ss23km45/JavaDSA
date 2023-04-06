package maths;


public class GCD_HCF {
    public static void main(String[] args) {
        System.out.println(LCM(1,4));
        System.out.println(gcd(1,4));
    }

    static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
    static int LCM(int a, int b)
    {
        return (a*b/gcd(a,b));
    }
}
