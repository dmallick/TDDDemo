import com.tdd.devops.HundredthHandler;
import com.tdd.devops.NumberToTextFormatter;
import com.tdd.devops.ThousandthHandler;
import com.tdd.devops.UnitAndTenthHandler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class NumberToTextFormatterTest {

    NumberToTextFormatter numberToTextFormatter;

    @Before
    public void before(){
        numberToTextFormatter = new NumberToTextFormatter();
    }

    @Test
    public void testIfTheClassExist(){
        assertNotNull(new NumberToTextFormatter());
    }

    @Test
    public void testIfUnitAndTenthHandlerClassExist(){  assertNotNull(new UnitAndTenthHandler());   }

    @Test
    public void testIfHundrednthHandlerClassExist(){  assertNotNull(new UnitAndTenthHandler());  }

    @Test
    public void testIfThousandthHandlerClassExist(){  assertNotNull(new UnitAndTenthHandler());   }

    @Test
    public void testIfInputIsValid(){
        String inputData ="12345";
        assertTrue( numberToTextFormatter.validateInput(inputData));
    }

    @Test
    public void testIfInputIsInvalid(){
        String inputData ="12A345";
        assertFalse( numberToTextFormatter.validateInput(inputData));
    }

    @Test
    public void testConversion9ToWord(){
        String unitPlaceNumber="9";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("nine"));
    }

    @Test
    public void testConversion10ToWord(){
        String unitPlaceNumber="10";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("ten"));
    }

    @Test
    public void testConversion21ToWord(){
        String unitPlaceNumber="21";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("twenty one"));
    }

    @Test
    public void testConversion99ToWord(){
        String unitPlaceNumber="99";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("ninety nine"));
    }

    @Test
    public void testConversion100ToWord(){
        String unitPlaceNumber="100";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("one hundred"));
    }

    @Test
    public void testConversion159ToWord(){
        String unitPlaceNumber="159";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("one hundred fifty nine"));
    }

    @Test
    public void testConversion999ToWord(){
        String unitPlaceNumber="999";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("nine hundred ninety nine"));
    }

    @Test
    public void testConversion3574ToWord(){
        String unitPlaceNumber="3574";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("three thousand five hundred seventy four"));
    }

    @Test
    public void testConversion9099ToWord(){
        String unitPlaceNumber="9099";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("nine thousand ninety nine"));
    }
    @Test
    public void testConversion9999ToWord(){
        String unitPlaceNumber="9999";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("nine thousand nine hundred ninety nine"));
    }

    @Test
    public void testConversion99999ToWord(){
        String unitPlaceNumber="99999";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("ninety nine thousand nine hundred ninety nine"));
    }


    @Test
    public void testUnitAndTenthHandler9(){
        assertTrue(new UnitAndTenthHandler().convert("9").equals("nine"));
    }

    @Test
    public void testHundredthHandler(){
        assertTrue(new HundredthHandler().convert("938").equals("nine hundred thirty eight"));
    }

    @Test
    public void testThousandthHandler(){
        assertTrue(new ThousandthHandler().convert("1919").equals("one thousand nine hundred nineteen"));
    }

    @After
    public void after(){
        numberToTextFormatter = null;
    }
}
