import com.tdd.devops.NumberToTextFormatter;
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
        assertTrue(numberToTextFormatter.convertTillDecimalPlace(unitPlaceNumber).equals("nine"));
    }

    @Test
    public void testConversionOfDecimalNumberToWord(){
        String unitPlaceNumber="19";
        assertTrue(numberToTextFormatter.convertTillDecimalPlace(unitPlaceNumber).equals("ninteen"));
    }

    @Test
    public void testConversionOfDecimalNumberGT20ToWord(){
        String unitPlaceNumber="21";
        assertTrue(numberToTextFormatter.convertTillDecimalPlaceAbove20(unitPlaceNumber).equals("twentyone"));
    }

    @Test
    public void testNumber35ToWord(){
        String unitPlaceNumber="35";
        assertTrue(numberToTextFormatter.convertTillDecimalPlaceAbove20(unitPlaceNumber).equals("thirtyfive"));
    }

    @Test
    public void testNumber99ToWord(){
        String unitPlaceNumber="99";
        assertTrue(numberToTextFormatter.convertTillDecimalPlaceAbove20(unitPlaceNumber).equals("ninetynine"));
    }

    @Test
    public void testNumber100ToWord(){
        String unitPlaceNumber="100";
        assertTrue(numberToTextFormatter.convertHundredNumber(unitPlaceNumber).equals("onehundred"));
    }

    @Test
    public void testNumber700ToWord(){
        String unitPlaceNumber="700";
        assertTrue(numberToTextFormatter.convertHundredNumber(unitPlaceNumber).equals("sevenhundred"));
    }

    @Test
    public void testNumber938ToWord(){
        String unitPlaceNumber="938";
        assertTrue(numberToTextFormatter.convertHundredNumber(unitPlaceNumber).equals("ninehundredthirtyeight"));
    }


    @Test
    public void testNumber919ToWord(){
        String unitPlaceNumber="919";
        assertTrue(numberToTextFormatter.convertHundredNumber(unitPlaceNumber).equals("ninehundrednineteen"));
    }

    @Test
    public void testNumber1919ToWord(){
        String unitPlaceNumber="1919";
        assertTrue(numberToTextFormatter.convertThousandNumber(unitPlaceNumber).equals("onethousandninehundrednineteen"));
    }


    @After
    public void after(){
        numberToTextFormatter = null;
    }
}
