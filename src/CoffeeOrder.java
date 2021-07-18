import java.util.HashMap;
import java.util.Map;


public class CoffeeOrder {
    private final int coffeeNumber;
    private final String name;
    private final int price; // Türk lirası
    private final Map<String, Integer> ingredients;

    public CoffeeOrder(int coffeeNumber, String name, int price, Map<String, Integer> ingredients) {
        this.coffeeNumber = coffeeNumber;
        this.name = name;
        this.price = price;
        this.ingredients = new HashMap<String, Integer>(ingredients);
    }

    public String coffeeInfo() {
        return coffeeNumber + ". " + name + " (" + price + " ₺)";
    }

    public String orderInfo() {
        int ind = 0;
        StringBuilder orderInfo = new StringBuilder(name + " seçtiniz. Bu içeceğimiz ");
        for (Map.Entry<String, Integer> entry: ingredients.entrySet()) {
            orderInfo.append(entry.getValue()).append(" doz ").append(entry.getKey().toLowerCase());
            ind++;
            if (ind != ingredients.entrySet().size())
                orderInfo.append(", ");
        }
        orderInfo.append(" içermektedir. Afiyet olsun.");
        return orderInfo.toString();
    }
}
