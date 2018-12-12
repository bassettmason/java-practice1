import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void testToString() {
        Shop testShop = new Shop ("Johnys", "$");
        String stringifiedShop = "Shop name: Johnys Rating: 0.0 Cost: $";


        assertEquals("Johnys", testShop.name);
        assertEquals(stringifiedShop, testShop.toString());
    }

}