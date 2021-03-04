package develop;


import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CreditCardTest {
    private CreditCard card = null;

    @Before
    public void setupCard(){
        card = new CreditCard("Abradolph Lincler", "4916119711304546");
        assertNotNull("CrediCard creada", card);
    }

    @Test
    public void constructorTest(){
        assertNotNull("CrediCard creada", card);
        assertEquals("4916119711304546", card.getNumber());
    }
    @Test
    public void payTestOk(){
        card.pay(3000.0);
        assertEquals(0, card.getCredit(), 0);
    }
    @Test
    public void payTestNotOk(){
        card.pay(4000.0);
        assertEquals(3000, card.getCredit(), 0);
    }
}
