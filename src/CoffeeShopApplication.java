import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CoffeeShopApplication {
    static class CoffeeOrder {
        int coffeeNumber;
        String name;
        int price; // Türk lirası
        Map<String, Integer> ingredients;

        CoffeeOrder(int coffeeNumber, String name, int price, Map<String, Integer> ingredients) {
            this.coffeeNumber = coffeeNumber;
            this.name = name;
            this.price = price;
            this.ingredients = new HashMap<String, Integer>(ingredients);
        }

        @Override
        public String toString() {
            return coffeeNumber + ". " + name + " (" + price + " ₺)\n";
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

        ArrayList<CoffeeOrder> coffeeList = new ArrayList<>();

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
        coffeeList.add(new CoffeeOrder(1, "Espresso", 7, esprIng));
        coffeeList.add(new CoffeeOrder(2, "Double Espresso", 12, dEsprIng));
        coffeeList.add(new CoffeeOrder(3, "Cappuccino", 12, cappIng));
        coffeeList.add(new CoffeeOrder(4, "Caffe Latte", 12, latteIng));
        coffeeList.add(new CoffeeOrder(5, "Mocha", 13, mochaIng));
        coffeeList.add(new CoffeeOrder(6, "Americano", 10, amerIng));
        coffeeList.add(new CoffeeOrder(7, "Hot Water", 3, waterIng));

        coffeeList.get(coffeeNumber - 1).printOrderInfo();
    }
}
