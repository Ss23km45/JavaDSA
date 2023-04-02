package patterns;

public class PatternQuestions {
    public static void main(String[] args) {
        pattern88(18);
    }

    static void pattern1 (int n){
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    static void pattern2(int n){
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    static void pattern3(int n){
        int i=0;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <=n-i ; col++) {
                System.out.print("* ");
            }
            i++;
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <=row ; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }

    static void pattern5(int n){
        int count=0,i=0;
        for(int row = 1; row <= n*2; row++) {

            if(row>n){
                count = row - n;
                i++;
            }
            for(int col = 1; col <=row-count-i ; col++) {
                System.out.print("* ");
            }


            System.out.println();
        }
    }

    static void triangle(int n){
        for (int rows = 0; rows <= n; rows++) {
            for (int col = 0; col <= n - rows ; col++) {
                System.out.print(" ");
            }
            for (int st = n-rows; st <=n; st++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern6(int n){
            for (int i= 0; i<= n; i++)
            {
                for (int j=1; j<=n-i; j++)
                {
                    System.out.print(" ");
                }
                for (int k=0;k<=i;k++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }

    }

    static void pattern88(int n){
        for (int i= 0; i<= n; i++)
        {
            //left, right, up and down of the Wall
            for (int j=0; j<=n; j++) {
                int value = Math.min(Math.min(j, i), Math.min(n-j, n-i));
                System.out.print(value + " ");
            }
            System.out.println();
        }

    }
}

