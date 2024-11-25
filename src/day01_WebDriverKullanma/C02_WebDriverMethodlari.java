package day01_WebDriverKullanma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_WebDriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webDriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://testotomasyonu.com");
        // istenen Url'e gider
        // url yazarken www yazmasak da WebDriver objesi url'e gider
        // ANCCAAAK https: yazmazsak kod calismaz


        System.out.println(driver.getTitle()); // Test Otomasyonu - Test Otomasyonu

        System.out.println(driver.getCurrentUrl()); // https://testotomasyonu.com/

        System.out.println("===============");

        System.out.println(driver.getPageSource());

        System.out.println("===============");

        System.out.println(driver.getWindowHandle()); // DF017F80E523EFD36A795CB26225B03C

        System.out.println(driver.getWindowHandles()); // [DF017F80E523EFD36A795CB26225B03C]

        // WebDriver olusturulan her bir objeye
        // benzersiz (unique) bir Window Handle Degeri atar.
        // Bu konu ilerde ayrica anlatilacak
        // Eger bir class calistiginda birden fazla windows acilirsa
        // herbirinin ayri bir Window Handle Degeri olur
        // getWindowHandle() driver'in actigi son window'un window handle degerini verir
        // getWindowHandles() ise acilan tum window'larin window handle degerlerini
        // bir Set olarak verir
        // driver'in acilan Window'lar arasinda gecis yapabilmesi icin
        // gececegi window'un window handle degerini bilmesi gerekir

        driver.quit(); // actigimiz driver'i kapatir
        // driver.close(); // actigimiz driver'i kapatir
        // aralarindaki fark; close() sadece 1 window kapatir
        // quit() ise test sirasinda biden fazla window acilsa da hepsini kapatir

    }
}
