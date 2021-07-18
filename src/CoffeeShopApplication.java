import java.util.Scanner;

public class CoffeeShopApplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final String coffeeList = "1. Espresso (7 ₺)\n" +
                "2. Double Espresso (12 ₺)\n" +
                "3. Cappuccino (12 ₺)\n" +
                "4. Caffe Latte (12 ₺)\n" +
                "5. Mocha (13 ₺)\n" +
                "6. Americano (10 ₺)\n" +
                "7. Hot Water  (3 ₺)\n";

        int coffeeNumber;

        // 1. Gereksinim
        System.out.println("Kahve Listesi: ");
        System.out.println(coffeeList);
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz:");
        coffeeNumber = scan.nextInt();

    }
}
