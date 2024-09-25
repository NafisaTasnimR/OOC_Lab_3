package TestTasks;

import Task1.NumWordPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWordPrinter {
    @Test
    public void testPrinter1()
    {
        String s = "Even";
        int n = 2;
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord(n));
    }

    @Test
    public void testPrinter2()
    {
        String s = "PrimeEleven";
        int n = 33;
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord(n));
    }
}
