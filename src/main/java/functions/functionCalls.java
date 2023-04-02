package functions;

public class functionCalls {
    public static void main(String[] args) {
        //Main will sit in stack memory untill method1 executes and completes...
        method1(1);
    }

    static void method1(int n){
        //method1 will sit in stack memory untill method1 executes and completes...
        System.out.println(n);
        method2(2);
    }

    static void method2(int n){
        System.out.println(n);
        method3(3);
    }

    static void method3(int n){
        System.out.println(n);
        method4(4);
    }

    static void method4(int n){
        System.out.println(n);
        method5(5);
    }

    static void method5(int n){
        System.out.println(n);
        method6(6);
    }

    static void method6(int n){
        System.out.println(n);
        method7(7);
    }

    static void method7(int n){
        System.out.println(n);
        method8(8);
    }
    static void method8(int n){
        System.out.println(n);
    }

}
