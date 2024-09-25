package TestTasks;

import Task1.NumWordPrinter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWordPrinter {
    @Test
    public void testPrinter1()
    {
        String s = "Even";
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        assertEquals(s,numWordPrinter.printWord());
    }
}
