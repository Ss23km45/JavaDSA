package util;

public class Palindrome {
    public static void main(String[] args) {
        String pali = "gthht";
        int start=0, end =pali.length()-1;
        int mid = end/2;

        while (start<= end){

            if(pali.charAt(start) == pali.charAt(end)){
                start++;
                end--;
            }
            else{
                System.out.println("Not a Palindrome");
                break;
            }

        }
        if((start >= mid) && (end <= mid)){
            System.out.println("Given String is a Palindrome"  + " Start " + start + " End " + end + " Mid is " + mid);
        }
    }
}
