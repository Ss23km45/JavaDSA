package recursion;

public class Recursion {
    public static void main(String[] args) {
        recur(2);
    }

    public static void recur(int n){

        try{
            if(n>1000)
                return;

            System.out.println("Calling me for the time " + n);
            recur(n+1);

        }catch (Exception e){
            System.out.println("Exception While Calling ME.....!!!" + e.toString());
        }

    }
}
