import com.tdd.devops.NumberToTextFormatter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class NumberToTextFunctionalTest {


    NumberToTextFormatter numberToTextFormatter;

    @Before
    public void before(){
        numberToTextFormatter = new NumberToTextFormatter();
    }



    @After
    public void after(){
        numberToTextFormatter = null;
    }
}
