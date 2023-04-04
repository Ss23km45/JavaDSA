package recursion;

public class FibonacciSeries {
    public static void main(String[] args) {

        System.out.println("Fibonacci Value for the Number Using Formula " + Math.round(fiboAtAnyNumber(19)));
        System.out.println("Fibonacci Value for the Number Using Recursion" + fiboSeries(19));



    }

    static double fiboAtAnyNumber(double N){
        //Formula
        return ((Math.pow(((1 + Math.sqrt(5))/2), N))/ Math.sqrt(5));

    }

    static long fiboSeries(long n){
        if(n<2)
            return n;

        return fiboSeries(n-1) + fiboSeries(n-2);
    }
}
