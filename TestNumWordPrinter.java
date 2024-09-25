import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestNumWordPrinter {
    @Test
    public void Test1(){
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        String outcome = numWordPrinter.printWord(13);
        String expectedOutCome = "LuckyThirteen";
        assertEquals(expectedOutCome,outcome);
    }
    @Test
    public void Test2(){
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        String outcome = numWordPrinter.printWord(11);
        String expectedOutCome = "PrimeEleven";
        assertEquals(expectedOutCome,outcome);
    }
    @Test
    public void Test3(){
        NumWordPrinter numWordPrinter = new NumWordPrinter();
        String outcome = numWordPrinter.printWord(22);
        String expectedOutCome = "EvenPrimeEleven";
        assertEquals(expectedOutCome,outcome);
    }



}
