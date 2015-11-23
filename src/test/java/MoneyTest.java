import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by seongjuhyeon on 11/21/15.
 */
public class MoneyTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);

        Dollar product = five.times(2);
        assertEquals(10, product.amount);

        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
