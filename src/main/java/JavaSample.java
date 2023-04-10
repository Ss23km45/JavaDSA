import java.util.Arrays;
interface a {
    void method();
}

class base {
    public void method(){
        System.out.println("I am here");
    }
}
public class JavaSample extends base implements a{
    public static void main(String[] args) {
        (new JavaSample()).method();
    }
}
