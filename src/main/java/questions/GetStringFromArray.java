package questions;

public class GetStringFromArray {
    public static void main(String[] args) {
        int[] array = new int[]{3,30,34,5,9,12,34,23,454,233};
        //233+454+23+34+12+3+30+34+5+9
        printString(array);
    }

    private static void printString(int[] array) {
        String abcd = "";
        int isReverse = 0;
        int mid = array.length/2;
        for(int i = 0; i <= array.length-1 ; i++) {
            if(i >= mid){
                abcd += Integer.toString(array[isReverse]);
                isReverse++;
            }else{
                abcd += Integer.toString(array[array.length-i-1]);
            }
        }

        System.out.println(abcd);
    }
}
