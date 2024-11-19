package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.cases;
import pages.dopingPurchase;
import utilities.ConfigReader;
import utilities.Driver;

import static org.testng.AssertJUnit.assertEquals;

public class dopingTest {
    String mainWindowsHandle;
    public void setUp() {
        WebDriver driver = Driver.getDriver();
        mainWindowsHandle = driver.getWindowHandle();
    }
    public void rejectCookie() {
        try {
            doping.cookieAyarlarButton.click();
            doping.cookieRedButton.click();
            System.out.println("Çerez reddetme işlemi başarılı.");
        } catch (Exception e) {
            System.out.println("Çerez reddetme sırasında bir hata oluştu: " + e.getMessage());
        }
    }
    public WebElement hemenSatinAlButton() {
        try {
            if (doping.hemenSatinal.isDisplayed()) {
                return doping.hemenSatinal;
            }
        } catch (Exception e) {
        }
        return doping.hemenSatinalPopup;
    }
    public void checksumAlButton() {
        try {
            if (doping.salesCheck.isDisplayed()&&doping.commercialCheck.isDisplayed()) {
                doping.salesCheck.click();
                doping.commercialCheck.click();
            }
        } catch (Exception e) {
            System.out.println("Checkboxlar aktif değil: " + e.getMessage());
        }
    }
    public void paymentMethodForCC(){
        doping.paymentMethodCC.click();
        doping.ccName.sendKeys(ConfigReader.getProperty("testName"));
        doping.ccNumber.sendKeys(ConfigReader.getProperty("testCard"));
        doping.ccMonth.click();

    }
    public void testSelectExpiryMonthAndYear() {
        WebElement monthOption = allCases.selectMonth(ConfigReader.getProperty("ccMonth"));
        Driver.waitForElementToBeClickable(monthOption);  // Öğenin tıklanabilir olmasını bekliyoruz
        monthOption.click();
        WebElement yearOption = allCases.selectYear(ConfigReader.getProperty("ccYear"));
        Driver.waitForElementToBeClickable(yearOption); //
        yearOption.click();
        doping.cvv.sendKeys(ConfigReader.getProperty("testCVV"));
    }

    public void switchToOtherHandles() {
        for (String windowsHandle : Driver.getDriver().getWindowHandles()) {
            if (!windowsHandle.equals(mainWindowsHandle)) {
                Driver.getDriver().switchTo().window(windowsHandle);
                break;
            }
        }
    }
    public void switchToMainHandle() {
        Driver.getDriver().switchTo().window(mainWindowsHandle);
    }
    public void corumSelect(){
        //WebElement cityOption = doping.selectCity(ConfigReader.getProperty("city"));
        //cityOption.click();
        doping.testSehir.click();
        doping.corumId.click();
    }
    public void headerCheck(){
        Driver.getDriver().get(ConfigReader.getProperty("dopingURL"));
        String strEnCokTercihEdilen = doping.enCokTercihEdilen.getText();
        String expectedString = "En Çok Tercih Edilen\n" +
                "Paketlerimiz";
        System.out.println("Actual = " + strEnCokTercihEdilen);
        System.out.println("expectedString = " + expectedString);
        assertEquals(strEnCokTercihEdilen, expectedString);
    }
    dopingPurchase doping = new dopingPurchase();
    cases allCases = new cases();
    @Test
    public void testPurchase() throws Exception {
        Driver.getDriver().get(ConfigReader.getProperty("dopingURL"));
        headerCheck();
        doping.firsProduct.click();
        hemenSatinAlButton().click();
        rejectCookie();
        doping.testIsim.sendKeys(ConfigReader.getProperty("testName"));
        doping.testTelefon.sendKeys(ConfigReader.getProperty("testPhone"));
        doping.testSubmitSection.click();
        Thread.sleep(2000);
        doping.testEmail.sendKeys(ConfigReader.getProperty("testEmail"));
        corumSelect();
        doping.testSubmitSection.click();
        checksumAlButton();
        Thread.sleep(2000);
        doping.testSubmitSection.click();
        paymentMethodForCC();
        Thread.sleep(2000);
        testSelectExpiryMonthAndYear();
        doping.testSubmitSection.click();
        Driver.getDriver().quit();
    };
    @Test
    public void test2() throws Exception {
    }
}
