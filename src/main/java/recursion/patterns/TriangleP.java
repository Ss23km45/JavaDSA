package recursion.patterns;

public class TriangleP {
    public static void main(String[] args) {
        patternbase(5);
    }

    static void patternbase(int N){
        pattern(N, 0);
    }
    static void pattern(int r, int c){
        if (r == 0) {
            return;
        }

        if (c < r) {
            System.out.print("* ");
            pattern(r, c+1);
        } else {
            System.out.println();
            pattern(r-1, 0);
        }



    }
}
