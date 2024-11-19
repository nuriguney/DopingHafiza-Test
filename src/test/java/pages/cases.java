package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class cases {
    public cases() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement selectCity(String cityValue) {
        String cityXvalue= "";
        switch (cityValue) {
            case "34":
                cityXvalue= "//*[@id=\"city\"]/option[2]"; // İstanbul
                break;
            case "06":
                cityXvalue= "//*[@id=\"city\"]/option[3]"; // Ankara
                break;
            case "35":
                cityXvalue= "//*[@id=\"city\"]/option[4]"; // Adana
                break;
            case "19":
                cityXvalue= "//*[@id=\"city\"]/option[27]"; // Çorum
                break;
            default:
                throw new IllegalArgumentException("Geçersiz şehir: " + cityValue);

        }

        return Driver.getDriver().findElement(By.xpath(cityValue));
    }
    public WebElement selectYear(String yearValue) {
        String yearXpath = "";
        switch (yearValue) {
            case "2024":
                yearXpath = "//*[@id=\"expiryYear\"]/option[2]";
                break;
            case "2025":
                yearXpath = "//*[@id=\"expiryYear\"]/option[3]";
                break;
            case "2026":
                yearXpath = "//*[@id=\"expiryYear\"]/option[4]";
                break;
            case "2027":
                yearXpath = "//*[@id=\"expiryYear\"]/option[5]";
                break;
            case "2028":
                yearXpath = "//*[@id=\"expiryYear\"]/option[6]";
                break;
            case "2029":
                yearXpath = "//*[@id=\"expiryYear\"]/option[7]";
                break;
            case "2030":
                yearXpath = "//*[@id=\"expiryYear\"]/option[8]";
                break;
            default:
                throw new IllegalArgumentException("Geçersiz yıl: " + yearValue);
        }
        // XPath ile WebElement'i buluyoruz
        return Driver.getDriver().findElement(By.xpath(yearXpath));
    }
    public WebElement selectMonth(String monthValue) {
        String monthXpath = "";
        switch (monthValue) {
            case "1":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[2]"; // Ocak
                break;
            case "2":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[3]"; // Şubat
                break;
            case "3":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[4]"; // Mart
                break;
            case "4":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[5]"; // Nisan
                break;
            case "5":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[6]"; // Mayıs
                break;
            case "6":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[7]"; // Haziran
                break;
            case "7":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[8]"; // Temmuz
                break;
            case "8":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[9]"; // Ağustos
                break;
            case "9":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[10]"; // Eylül
                break;
            case "10":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[11]"; // Ekim
                break;
            case "11":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[12]"; // Kasım
                break;
            case "12":
                monthXpath = "//*[@id=\"expiryMonth\"]/option[13]"; // Aralık
                break;
            default:
                throw new IllegalArgumentException("Geçersiz ay: " + monthValue);
        }
        return Driver.getDriver().findElement(By.xpath(monthXpath));
    }

}
