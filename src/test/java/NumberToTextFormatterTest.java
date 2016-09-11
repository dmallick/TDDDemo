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
        assertNotNull(numberToTextFormatter);
    }

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
    public void testConversionOfUnitNumberToWord(){
        String unitPlaceNumber="9";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).equals("nine"));
    }

    @Test
    public void testConversionOfTenthNumberToWord(){
        String unitPlaceNumber="19";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).equals("nineteen"));
    }

    @Test
    public void testConversionOfTenthNumberGT20ToWord(){
        String unitPlaceNumber="21";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("twenty one"));
    }

    @Test
    public void testNumber35ToWord(){
        String unitPlaceNumber="35";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("thirty five"));
    }

    @Test
    public void testNumber99ToWord(){
        String unitPlaceNumber="99";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("ninety nine"));
    }

    @Test
    public void testNumber100ToWord(){
        String unitPlaceNumber="100";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("one hundred"));
    }

    @Test
    public void testNumber700ToWord(){
        String unitPlaceNumber="700";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("seven hundred"));
    }

    @Test
    public void testNumber938ToWord(){
        String unitPlaceNumber="938";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("nine hundred thirty eight"));
    }


    @Test
    public void testNumber919ToWord(){
        String unitPlaceNumber="919";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).trim().equals("nine hundred nineteen"));
    }

    @Test
    public void testNumber1919ToWord(){
        String unitPlaceNumber="1919";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).equals("one thousand nine hundred nineteen"));
    }

    @Test
    public void testNumber2919ToWord(){
        String unitPlaceNumber="2919";
        assertTrue(numberToTextFormatter.process(unitPlaceNumber).equals("two thousand nine hundred nineteen"));
    }

    @Test
    public void testUnitAndTenthHandler(){
        assertNotNull(new UnitAndTenthHandler());
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
