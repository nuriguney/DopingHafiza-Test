package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class dopingPurchase {

    public dopingPurchase() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "/html/body/main/section[1]/div[1]/div[2]/div[1]/div[1]/a/div[2]")
    public WebElement firsProduct;
    @FindBy(xpath = "/html/body/div[10]/div/div[3]/div[2]/button")
    public WebElement hemenSatinalPopup;
    @FindBy(xpath = "/html/body/div[8]/main/section[1]/div/div/div[1]/div/div[2]/div[3]/div/div[2]/button")
    public WebElement hemenSatinal;
    @FindBy(xpath = "//*[@id=\"cookiespool-banner\"]/div/div[2]/button[2]")
    public WebElement cookieAyarlarButton;
    @FindBy(xpath = "/html/body/div[1]/div/div/div[2]/button[2]")
    public WebElement cookieRedButton;
    @FindBy(xpath = "/html/body/main/div[1]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[1]")
    public WebElement sepettekiUrunAdi;
    @FindBy(xpath = "/html/body/main/div[1]/div[1]/div[1]/div[1]/div/div[1]/div[2]/div[2]/div[1]")
    public WebElement expectedUrunFiyati;
    @FindBy(xpath = "//*[@id=\"fullName\"]")
    public WebElement testIsim;
    @FindBy(xpath = "//*[@id=\"telephone\"]")
    public WebElement testTelefon;
    @FindBy(xpath = "//*[@id=\"submit-section\"]/button")
    public WebElement testSubmitSection;
    @FindBy(xpath = "/html/body/main/div[1]/div[2]/div/form/div[2]/div[1]/input")
    public WebElement testEmail;
    @FindBy(xpath = "/html/body/main/div[1]/div[2]/div/form/div[2]/div[1]/input")
    public WebElement testSehir;
    @FindBy(xpath = "//*[@id=\"city\"]/option[27]")
    public WebElement corumId;
    @FindBy(xpath = "//*[@id=\"sales-check\"]")
    public WebElement salesCheck;
    @FindBy(xpath = "//*[@id=\"commercial-check\"]")
    public WebElement commercialCheck;
    @FindBy(xpath = "/html/body/main/div[1]/div[2]/div/div/div[1]/div/div[1]/div[1]")
    public WebElement paymentMethodCC;
    @FindBy(xpath = "//*[@id=\"creditCardName\"]")
    public WebElement ccName;
    @FindBy(xpath = "//*[@id=\"creditCardNumber\"]")
    public WebElement ccNumber;
    @FindBy(xpath = "//*[@id=\"expiryMonth\"]")
    public WebElement ccMonth;
    @FindBy(xpath = "//*[@id=\"expiryYear\"]")
    public WebElement ccYear;
    @FindBy(xpath = "//*[@id=\"cc-form\"]/div[3]/div[3]/input")
    public WebElement cvv;
    //Test2
    @FindBy(xpath = "/html/body/main/section[1]/div[1]/h2")
    public WebElement enCokTercihEdilen;
}