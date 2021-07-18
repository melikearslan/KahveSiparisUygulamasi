import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class CoffeeOrderTest {

    private CoffeeOrder coffeeOrder;

    @BeforeEach
    public void setUp() throws Exception {
        Map<String, Integer> ingredients;
        ingredients = Map.ofEntries(
                Map.entry("Sıcak Su", 1),
                Map.entry("Buharla Isıtılmış Süt", 2)
        );
        coffeeOrder = new CoffeeOrder(1, "Test Coffee", 15, ingredients);
    }

    @Test
    @DisplayName("Coffee information should be returned correctly")
    public void coffeeInfo() {
        String expected = "1. Test Coffee (15 ₺)";
        assertEquals(expected, coffeeOrder.coffeeInfo());
    }

    @Test
    @DisplayName("Order information should be returned correctly")
    public void orderInfo() {
        String expected = "Test Coffee seçtiniz. Bu içeceğimiz "
                + "2 doz buharla ısıtılmış süt, "
                + "1 doz sıcak su "
                + "içermektedir. Afiyet olsun.";
        assertEquals(expected, coffeeOrder.orderInfo());
    }
}