package tut4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class TestCalc
{
   
    @Test
    public void addTest()
    {
        assertEquals(2, Calc.add(1,1));
    }




}