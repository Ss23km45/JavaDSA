package bitwiseOP;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MatrixInversion {
    public static void main(String[] args) {
        int[][] arr = { {1,0,1,1},{0,0,0,1},{1,1,1,0}, { 0,1,0,1} };
       // System.out.println(arr[0].length);
        //System.out.println(Arrays.toString(arr[1]));
        MatrixInve(arr);
    }

    static void MatrixInve(int[][] boolarr){

        for (int i = 0; i < boolarr.length-1; i++) {
            int start =0;
            int end = boolarr[i].length-1;
            while(start<end){

                /*if(boolarr[i][start] ==1){
                    boolarr[i][start] =0;
                }else{boolarr[i][start] = 1;}

                if(boolarr[i][end] ==1){
                    boolarr[i][end] =0;
                }else{boolarr[i][end] = 1;} */


                int temp = boolarr[i][start];
                boolarr[i][start] = boolarr[i][end]^1;
                boolarr[i][end] = temp ^1;
                start++;
                end--;
            }
        }
        for (int i = 0; i < boolarr.length; i++) {
            System.out.println(Arrays.toString(boolarr[i]));
        }

    }
}
