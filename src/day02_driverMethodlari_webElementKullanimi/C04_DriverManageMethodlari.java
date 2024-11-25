package day02_driverMethodlari_webElementKullanimi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_DriverManageMethodlari {

    public static void main(String[] args) {

        /*
            Test otomasyonu bizim kodlarimizin
            bizim yerimize internette
            Web sayfalarinda islem yapmasidir

            Bizim yazdigimiz Java kodlarinin hizi ile

            1- bilgisayarimiz
            2- internetimiz
            3- ve ulasmaya calistigimiz sayfanin
            hizlari arasinda fark olur.

            Bu hizlar arasindaki fark
            kodlarimizin calisamamasina
            veya testin FAILED olmasina sebep olur

         */



        System.setProperty("Webdriver.chrome.driver","kurulumDosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));




    }
}
