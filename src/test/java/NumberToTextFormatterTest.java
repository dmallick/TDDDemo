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

    @After
    public void after(){
        numberToTextFormatter = null;
    }
}
