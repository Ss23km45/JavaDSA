package oops.object.oriented.programming;


//If We are creating any new class outside the FileNamed Class it should not be static
class StaticClass2{

    static String name;
    static int a = 10;
    static int b;
    static {
        b = a*252;
    }
    StaticClass2(String NAme){
        this.name = NAme;
    }
}
public class StaticClass {
    //If We are creating any new class Inside the FileNamed Class it should  be static
    //Because inside the Filenamed Class we do not need object to access
    //Where as for outside it should need


    static class StaticClass3{
        int val;
        StaticClass3(){

        }

        /*static void returnable(){
            System.out.println(this.val);
        } */

        void work(){
            System.out.println(this.val);
        }

    }

    public static void main(String[] args) {

        //it will not give any error
        StaticClass2 st = new StaticClass2("Mukesh");
        StaticClass2 st2 = new StaticClass2("Kedar");


       //Both Will return Kedar because Variable is Static
        System.out.println(st.name);
        System.out.println(st2.name);
        System.out.println(st.a + "  " + st.b);
        System.out.println(st2.a + "  " + st2.b);

    }

}
