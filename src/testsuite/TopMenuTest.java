package testsuite;

import browserfactory.BaseTest;
import javafx.scene.control.Tab;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        // Clicking on the computers tab on top menu
        WebElement computersTab = driver.findElement(By.linkText("Computers"));
        computersTab.click();

        // This is from the given requirements
        String expectedText = "Computers";
        // Find the computers text element and get the text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualText = actualTextElement.getText();
        //Validate expected and actual text 'Computers'
        Assert.assertEquals("Unable to navigate to categories: Computers", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        // Clicking on the electronics tab on top menu
        WebElement electronicsTab = driver.findElement(By.linkText("Electronics"));
        electronicsTab.click();

        // This is from the given requirements
        String expectedText = "Electronics";
        // Find the electronics text element and get the text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualText = actualTextElement.getText();
        //Validate expected and actual text 'Electronics'
        Assert.assertEquals("Unable to navigate to categories: Electronics", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        // Clicking on the apparel tab on top menu
        WebElement apparelTab = driver.findElement(By.linkText("Apparel"));
        apparelTab.click();
        // This is from the given requirements
        String expectedText = "Apparel";
        // Find the apparel text element and get the text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualText = actualTextElement.getText();
        //Validate expected and actual text 'Apparel'
        Assert.assertEquals("Unable to navigate to categories: Apparel", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        // Clicking on the digital downloads tab on top menu
        WebElement digitalDownloadsTab = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloadsTab.click();

        // This is from the given requirements
        String expectedText = "Digital downloads";
        // Find the digital downloads text element and get the text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualText = actualTextElement.getText();
        //Validate expected and actual text 'Digital downloads'
        Assert.assertEquals("Unable to navigate to categories: Digital downloads", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        // Clicking on the books tab on top menu
        WebElement booksTab = driver.findElement(By.linkText("Books"));
        booksTab.click();

        // This is from the given requirements
        String expectedText = "Books";
        // Find the books text element and get the text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualText = actualTextElement.getText();
        //Validate expected and actual text 'Books'
        Assert.assertEquals("Unable to navigate to categories: Books", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        // CLicking on the jewelry tab on top menu
        WebElement jewelryTab = driver.findElement(By.linkText("Jewelry"));
        jewelryTab.click();

        // This is from the given requirements
        String expectedText = "Jewelry";
        // Find the jewelry text element and get the text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualText = actualTextElement.getText();
        //Validate expected and actual text 'Jewelry'
        Assert.assertEquals("Unable to navigate to categories: Jewelry", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        // CLicking on the gift cards tab on top menu
        WebElement giftCardsTab = driver.findElement(By.linkText("Gift Cards"));
        giftCardsTab.click();

        // This is from the given requirements
        String expectedText = "Gift Cards";
        // Find the gift cards text element and get the text
        WebElement actualTextElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualText = actualTextElement.getText();
        //Validate expected and actual text 'Gift Cards'
        Assert.assertEquals("Unable to navigate to categories: Gift Cards", expectedText, actualText);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}