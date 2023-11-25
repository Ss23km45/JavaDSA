package questions;

class A{
    void m1() throws ArrayIndexOutOfBoundsException{
        System.out.println("In  A m1");
    }

    void m2(){
        System.out.println("In A m2");
    }
}

class B extends A{
    void m1() throws ArrayIndexOutOfBoundsException{
        System.out.println("In B m1");
    }

    void m2() throws IndexOutOfBoundsException{
        System.out.println("In b m2");
    }
}
public class CompileTime {
    public static void main(String[] args) {
        A a = new B();
            a.m2();
    }
}
