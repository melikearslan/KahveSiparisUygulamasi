import java.util.Scanner;

public class CoffeeShopApplication {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int coffeeNumber;
        CoffeeList coffeeList = new CoffeeList();

        // 1. Gereksinim
        System.out.println("Kahve Listesi: ");
        for (CoffeeOrder order: coffeeList.getList()) {
            System.out.println(order.coffeeInfo());
        }
        System.out.println("Lütfen içmek istediğiniz kahvenin numarasını giriniz:");
        coffeeNumber = scan.nextInt();
        while (coffeeNumber < 1 || coffeeNumber > 7) {
            System.out.println("Lütfen 1 ile 7 arası geçerli bir numara giriniz: ");
            coffeeNumber = scan.nextInt();
        }

        // 2. Gereksinim
        System.out.println("Teşekkürler kahveniz hazırlanıyor.");

        // 3. Gereksinim
        System.out.println(coffeeList.getList().get(coffeeNumber - 1).orderInfo());
    }
}
