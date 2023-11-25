package questions;

import java.util.regex.Pattern;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String repeated = "aabee";//"abcdcaf";
        int index = checkFirstNonRepeatedCharacter(repeated);

        System.out.println("First Non Repeated character found at " + index);
    }

    private static int checkFirstNonRepeatedCharacter(String repeated) {
        /*for (int i = 0; i < repeated.length(); i++) {
            int count = 0;
            for (int j = 0; j < repeated.length(); j++) {
                if(repeated.charAt(i) == repeated.charAt(j)){
                    count ++;
                }
            }
            if(count==1){
                return i;
            }
        }*/

        for (int i = 0; i < repeated.length(); i++) {
            char c = repeated.charAt(i);
            if(repeated.indexOf(c)== repeated.lastIndexOf(c)){
                return i;
            }
        }



        return -1;
    }


}
