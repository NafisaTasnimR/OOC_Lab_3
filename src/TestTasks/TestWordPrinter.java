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
        boolean wantUpperCase = false;
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord(n,wantUpperCase));
    }

    @Test
    public void testPrinter2()
    {
        String s = "PrimeEleven";
        int n = 33;
        boolean wantUpperCase = false;
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord(n,wantUpperCase));
    }

    @Test
    public void testPrinter3()
    {
        String s = "LuckyThirteen";
        int n = 39;
        boolean wantUpperCase = false;
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord(n,wantUpperCase));
    }

    @Test
    public void testPrinter4()
    {
        String s = "EvenPrimeEleven";
        int n = 22;
        boolean wantUpperCase = false;
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord(n,wantUpperCase));
    }
    @Test
    public void testPrinter5()
    {
        String s = "EvenPrimeLucky";
        int n = 286;
        boolean wantUpperCase = false;
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord(n,wantUpperCase));
    }
    @Test
    public void testPrinter6()
    {
        String s = "OddOneOut";
        int n = 5;
        boolean wantUpperCase = false;
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord(n,wantUpperCase));
    }

    @Test
    public void testPrinter7()
    {
        String s = "ODDONEOUT";
        int n = 5;
        boolean wantUpperCase = true;
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord(n,wantUpperCase));
    }
}
