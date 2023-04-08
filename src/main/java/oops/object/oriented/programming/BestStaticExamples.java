package oops.object.oriented.programming;

public class BestStaticExamples {
    int number;
    String name;
    long sal;

    // @total Everytime when we created an object this ill get incremented
    // And it will provide how many objects has been instantiated
    static int total;

    public BestStaticExamples(int number, String name, long sal) {
        this.number = number;
        this.name = name;
        this.sal = sal;
        BestStaticExamples.total +=1;
    }



    static void example1(){
        //this will throw error cause error() method is a non-static static method will
        //Accept only static methods cause it cannot create any objectes on his own
        //error();

        //To Achive this we have instantiate like this
        BestStaticExamples best = new BestStaticExamples(2,"euv", 452424);
        best.error();

    }

    void error(){

    }
}
