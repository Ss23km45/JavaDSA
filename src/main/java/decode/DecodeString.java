package decode;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DecodeString {
    public static void main(String[] args) {
        String encodedString = "3[abc4[kao]]";
        //Decoded String should be abcabcabckaokaokao
        //9118693971221932
        Stack<Object> stack = new Stack<>(); //3
        Stack<String> stackStr = new Stack<String>(); // abc
        String s = ""; //abc
        for (int i = 0; i < encodedString.length(); i++) {
            Character charr = encodedString.charAt(i);
            if(Character.isDigit(charr)){
                stack.push(Integer.parseInt(charr.toString()));
            }else if(charr=='['){
                stack.push(charr);
            }else if((stack.peek().toString().equalsIgnoreCase("[")) && isAlphabet(charr)){
                s += charr.toString();

            }

            if(charr==']'){
                stackStr.push(s);
                s = "";
            }

        }

       System.out.println( "String stack has below values " + stackStr.pop() + stackStr.pop());
        System.out.println( "String stack has below values " + stack);

    }

    private static boolean isAlphabet(Character charr) {
        Pattern p = Pattern.compile("[a-zA-Z]");
        Matcher m = p.matcher(charr.toString());

        System.out.println("Input Character is Matching " + m.matches());

        return m.matches();
    }
}
