package custom;

import java.util.ArrayList;

public class CustomArrayListTest {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("mySting");
        myArrayList.add("mySting1");
        myArrayList.add("mySting2");
        myArrayList.add("mySting3");

        myArrayList.append("Appending", 3);

        myArrayList.delete("mySting3");
        System.out.println(myArrayList.search("mySting3"));
        System.out.println(myArrayList.toString());
    }


}
