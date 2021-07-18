# Kahve Sipariş Uygulaması 
Kahve siparişi yapılabilen basit bir console uygulaması. Çalıştırılabilir kısım CoffeeShopApplication sınıfı altında. 
Kullanıcıya bir kahve listesi konsol çıktısı olarak verilir. Bu kahve listesi CoffeeList objesi olarak tanımlanmıştır.
CoffeeList objesi içerisinde sabit olarak tanımlanmış bir ArrayList bulunmaktadır. Bu ArrayList CoffeeOrder objelerinden
oluşmaktadır.

Her CoffeeOrder objesinin numara, isim, fiyat ve içerik özellikleri bulunmaktadır. İçerik özellikleri için yapı olarak 
HashMap kullanılmıştır. Böylece CoffeeOrder objesinin içerikleri anahtar olarak, miktarları da değer olarak 'ingredients'
map'inde saklanmaktadır.

coffeeInfo() fonksiyonu kahve listesi için CoffeeOrder objesinin numara, isim ve fiyat bilgilerini String olarak
döndürmektedir. orderInfo() fonksiyonu seçilen kahve ve içeriği hakkında CoffeeOrder objesinin gerekli bilgilerini
String olarak döndürmektedir.

CoffeeOrderTest sınıfı unit test sınıfıdır. Bunun için jUnit5 kütüphanesini kullanılan IDE'ye göre manuel olarak local
dosyalara lib olarak indirilebilir [1]. Veya Maven kullanıldıysa dependency olarak 'pom.xml' dosyasına eklenebilir.

### Maven Dependency
```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.5.2</version>
</dependency>
```

**Implemented by:**
<a href="mailto:melike.arslan@gmail.com"> Melike Arslan </a>
            [<img src="https://img.icons8.com/color/18/000000/linkedin-2--v2.png"/>](https://www.linkedin.com/in/melikearslan97/)
            [<img src="https://img.icons8.com/fluent/18/000000/github.png"/>](https://github.com/melikearslan)

### Referanslar
<ol type="1">
  <li> <a href="https://www.jetbrains.com/help/idea/testing.html#add-testing-libraries">IntelliJ'e manuel olarak test kütüphanesi ekleme</a> </li>
</ol>
