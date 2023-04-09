package oops.object.oriented.programming.inheritance.singleInh;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleInheritanceTest {

    @Test
    public static void main(String[] args) {
        SingleInheritance SI = new SingleInheritance(2556,432);

        assertEquals(2556,SI.a);
        assertEquals(432,SI.b);

    }




}