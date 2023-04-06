package recursion;

public class SumofDigits {

    public static void main(String[] args) {
        System.out.println(rev(123456789));
    }

    static int sumofDigits(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + sumofDigits(n/10);
    }

    static int rev(int Num){
        int num = (int) (Math.log10(Num)+1);

        return reverseInt(Num, num);
    }

    static int reverseInt(int Num, int digits){
        if(Num%10 == Num){
            return Num;
        }

        return (int)(((Num%10) * (Math.pow(10,digits-1)) + reverseInt(Num/10, digits-1)));
    }
}
