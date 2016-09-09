import com.tdd.devops.NumberToTextFormatter;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by VH68 on 9/9/2016.
 */

public class NumberToTextFormatterTest {

    @Test
    public void testIfTheClassExist(){
        NumberToTextFormatter numberToTextFormatter = new NumberToTextFormatter();

        assertNotNull(numberToTextFormatter);

    }
}
