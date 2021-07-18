import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeShopApplication {
    static class CoffeeOrder {
        String name;
        Map<String, Integer> ingredients;

        CoffeeOrder(String name) {
            this.name = name;
            ingredients = new HashMap<String, Integer>();
        }

        void addIngredients(Map<String, Integer> i) {
            for (Map.Entry<String, Integer> entry: i.entrySet()) {
                ingredients.put(entry.getKey(), entry.getValue());
            }
        }

        void printOrderInfo() {
            int ind = 0;
            System.out.println(name + " seçtiniz. Bu içeceğimiz: ");
            for (Map.Entry<String, Integer> entry: ingredients.entrySet()) {
                System.out.print("- " + entry.getValue() + " doz "
                        + entry.getKey());
                ind++;
                if (ind != ingredients.entrySet().size())
                    System.out.print(",\n");
            }
            System.out.println("\niçermektedir. Afiyet olsun.");
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final String coffeeList = "1. Espresso (7 ₺)\n" +
                "2. Double Espresso (12 ₺)\n" +
                "3. Cappuccino (12 ₺)\n" +
                "4. Caffe Latte (12 ₺)\n" +
                "5. Mocha (13 ₺)\n" +
                "6. Americano (10 ₺)\n" +
                "7. Hot Water  (3 ₺)\n";

        Map<String, CoffeeOrder> recipes = new HashMap<String, CoffeeOrder>();
        Map<String, Integer> esprIng = Map.ofEntries(
                Map.entry("Espresso", 1)
        );
        Map<String, Integer> dEsprIng = Map.ofEntries(
                Map.entry("Espresso", 2)
        );
        Map<String, Integer> amerIng = Map.ofEntries(
                Map.entry("Espresso", 1),
                Map.entry("Sıcak Su", 4)
        );
        Map<String, Integer> cappIng = Map.ofEntries(
                Map.entry("Espresso", 1),
                Map.entry("Buharla Isıtılmış Süt", 2),
                Map.entry("Süt Köpüğü", 2)
        );
        Map<String, Integer> latteIng = Map.ofEntries(
                Map.entry("Espresso", 1),
                Map.entry("Buharla Isıtılmış Süt", 3),
                Map.entry("Süt Köpüğü", 1)
        );
        Map<String, Integer> mochaIng = Map.ofEntries(
                Map.entry("Espresso", 1),
                Map.entry("Buharla Isıtılmış Süt", 1),
                Map.entry("Süt Köpüğü", 1),
                Map.entry("Sıcak Çikolata", 2)
        );
        Map<String, Integer> waterIng = Map.ofEntries(
                Map.entry("Sıcak Su", 5)
        );

        int coffeeNumber;

        // 1. Gereksinim
        System.out.println("Kahve Listesi: ");
        System.out.println(coffeeList);
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz:");
        coffeeNumber = scan.nextInt();

        // 2. Gereksinim
        System.out.println("Teşekkürler kahveniz hazırlanıyor.");

        // 3. Gereksinim
        recipes.put("Espresso", new CoffeeOrder("Espresso"));
        recipes.put("Double Espresso", new CoffeeOrder("Double Espresso"));
        recipes.put("Americano", new CoffeeOrder("Americano"));
        recipes.put("Cappuccino", new CoffeeOrder("Cappuccino"));
        recipes.put("Caffe Latte", new CoffeeOrder("Caffe Latte"));
        recipes.put("Mocha", new CoffeeOrder("Mocha"));
        recipes.put("Hot Water", new CoffeeOrder("Hot Water"));

        recipes.get("Espresso").addIngredients(esprIng);
        recipes.get("Double Espresso").addIngredients(dEsprIng);
        recipes.get("Americano").addIngredients(amerIng);
        recipes.get("Cappuccino").addIngredients(cappIng);
        recipes.get("Caffe Latte").addIngredients(latteIng);
        recipes.get("Mocha").addIngredients(mochaIng);
        recipes.get("Hot Water").addIngredients(waterIng);

        switch (coffeeNumber) {
            case 1:
                recipes.get("Espresso").printOrderInfo();
                break;
            case 2:
                recipes.get("Double Espresso").printOrderInfo();
                break;
            case 3:
                recipes.get("Americano").printOrderInfo();
                break;
            case 4:
                recipes.get("Cappuccino").printOrderInfo();
                break;
            case 5:
                recipes.get("Caffe Latte").printOrderInfo();
                break;
            case 6:
                recipes.get("Mocha").printOrderInfo();
                break;
            case 7:
                recipes.get("Hot Water").printOrderInfo();
                break;
            default:
                System.out.println("Lütfen geçerli bir numara giriniz: ");

        }



    }
}
