package recursion;

import java.util.ArrayList;

public class SumofDigits {

    public static void main(String[] args) {
        System.out.println(source(736352925,9));
        System.out.println((int)(Math.log10(736352925)+1));
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


    static int source(int sourceNum, int search){
        return countofDigit(sourceNum, 0,search);
    }


    static int countofDigit(int sourceNum, int digittoCount,int search){
        int rem = sourceNum % 10;
        if(rem==0){
            return digittoCount;
        }


        if(rem==search){
            return countofDigit(sourceNum/10, digittoCount+1,search);
        }else{
            return countofDigit(sourceNum/10, digittoCount,search);
        }
    }
}
