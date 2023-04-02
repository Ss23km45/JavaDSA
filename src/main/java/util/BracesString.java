package util;


public class BracesString {
    public static void main(String[] args) {
        String str = "(()){{[[}}]](})";
        System.out.println(stringBraces(str));
    }

    static boolean stringBraces(String Str){
        int op=0,cp=0,of=0,cf=0,os=0,cs=0;

        for (int i = 0; i < Str.length(); i++) {
            if (('(') == Str.charAt(i)) {
                op++;
            }
            else if ((')') == Str.charAt(i)) {
                cp++;
            }else if (('{') == Str.charAt(i)) {
                of++;
            }else if (('}') == Str.charAt(i)) {
                cf++;
            }else if (('[') == Str.charAt(i)) {
                os++;
            }else if ((']') == Str.charAt(i)) {
                cs++;
            }

        }
        if((op==cp) && (of==cf) && (os==cs)){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;

    }
}
