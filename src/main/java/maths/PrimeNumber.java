package maths;

import java.util.Arrays;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrime(17));
        int N = 19;
        boolean[] arr = new boolean[N+1];
        arePrimes(arr, N);
    }

    static boolean isPrime(int Number){
        int num =2;
        if(Number ==1)
            return true;
        while(num * num < Number){
            if(Number%num == 0){
                System.out.println("IT is Divisible by " + num);
                return false;
            }
            num++;
        }

        return true;
    }

    //False means Prime , True means Not Prime

    static void arePrimes(boolean[] primes, int n){

        for (int i = 2; i*i <= n; i++) {
            if(!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j] = true;
                }

            }

        }

        for (int i = 1; i < n; i++) {
            if(!primes[i]){
                System.out.println("Prime Numbers " + i);
            }
        }

        System.out.println(Arrays.toString(primes));

    }
}
