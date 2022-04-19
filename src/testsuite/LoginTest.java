package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToLoginPageSuccessfully(){
        //Find login link element and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // This is from the given requirements
        String expectedMessage = "Welcome, Please Sign In!";
        // Find the welcome text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"
        ));
        String actualMessage = actualMessageElement.getText();

        //Validate expected and actual message
        Assert.assertEquals("Login unsuccessful", expectedMessage,actualMessage);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        //Find login link element and click on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        // Finding the email field element
        WebElement userName = driver.findElement(By.id("Email"));
        userName.sendKeys("alpha789@gmail.com");
        // Finding the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        // sending Password to password field element
        passwordField.sendKeys("Abc8909");
        // Finding the login button and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginButton.click();
        //Verify the given text from the requirements
        String expectedTextMessage = "Log out";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        //Getting the text by using get method
        String actualTextMessage = actualTextMessageElement.getText();
        //Validate expected and actual text message
        Assert.assertEquals("Log out text message is not matching", expectedTextMessage,actualTextMessage);
    }

    @Test
    public void verifyTheErrorMessage(){
        //Finding login link element and clicking on login link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        // Finding the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Sending email to email field element
        emailField.sendKeys("raymond23@gmail.com");

        // Finding the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        // sending Password to password field element
        passwordField.sendKeys("alfaRo123");
        // Finding the login button and clicking on it
        WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginButton.click();
        //Verifying the text from the given requirements
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" + "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();

        //Validate expected and actual message
        Assert.assertEquals("Error message displayed", expectedErrorMessage,actualErrorMessage);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

    }
