import java.util.ArrayList;
import java.util.Map;

public class CoffeeList {
    private final ArrayList<CoffeeOrder> list;
    private final Map<String, Integer> esprIng = Map.ofEntries(
            Map.entry("Espresso", 1)
    );
    private final Map<String, Integer> dEsprIng = Map.ofEntries(
            Map.entry("Espresso", 2)
    );
    private final Map<String, Integer> amerIng = Map.ofEntries(
            Map.entry("Espresso", 1),
            Map.entry("Sıcak Su", 4)
    );
    private final Map<String, Integer> cappIng = Map.ofEntries(
            Map.entry("Espresso", 1),
            Map.entry("Buharla Isıtılmış Süt", 2),
            Map.entry("Süt Köpüğü", 2)
    );
    private final Map<String, Integer> latteIng = Map.ofEntries(
            Map.entry("Espresso", 1),
            Map.entry("Buharla Isıtılmış Süt", 3),
            Map.entry("Süt Köpüğü", 1)
    );
    private final Map<String, Integer> mochaIng = Map.ofEntries(
            Map.entry("Espresso", 1),
            Map.entry("Buharla Isıtılmış Süt", 1),
            Map.entry("Süt Köpüğü", 1),
            Map.entry("Sıcak Çikolata", 2)
    );
    private final Map<String, Integer> waterIng = Map.ofEntries(
            Map.entry("Sıcak Su", 5)
    );

    public CoffeeList() {
        list = new ArrayList<>();
        list.add(new CoffeeOrder(1, "Espresso", 7, esprIng));
        list.add(new CoffeeOrder(2, "Double Espresso", 12, dEsprIng));
        list.add(new CoffeeOrder(3, "Cappuccino", 12, cappIng));
        list.add(new CoffeeOrder(4, "Caffe Latte", 12, latteIng));
        list.add(new CoffeeOrder(5, "Mocha", 13, mochaIng));
        list.add(new CoffeeOrder(6, "Americano", 10, amerIng));
        list.add(new CoffeeOrder(7, "Hot Water", 3, waterIng));
    }

    ArrayList<CoffeeOrder> getList() {
        return list;
    }



}
