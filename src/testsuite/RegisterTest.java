package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        //Find register link element and click on register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        // This is from the given requirements
        String expectedMessage = "Register";

        // Find the register text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = actualMessageElement.getText();
        //Validate expected and actual message
        Assert.assertEquals("Navigated to register page successfully", expectedMessage, actualMessage);
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //Find register link element and click on register link
        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        // Finding the gender element by clicking on radio button
        WebElement radioButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        radioButton.click();
        // Finding the first name element
        WebElement firstName = driver.findElement(By.name("FirstName"));
        firstName.sendKeys("Raymond");
        // Finding the last name element
        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName.sendKeys("Ray");
        // Finding the date of birth field element
        WebElement dateOfBirth = driver.findElement(By.name("DateOfBirthDay"));
        // sending date to date field element
        dateOfBirth.sendKeys("17");
        // Finding the month of birth field element
        WebElement monthOfBirth = driver.findElement(By.name("DateOfBirthMonth"));
        // sending month name to month field element
        monthOfBirth.sendKeys("April");
        // Finding the year of birth field element
        WebElement yearOfBirth = driver.findElement(By.name("DateOfBirthYear"));
        // sending the birth year to year field element
        yearOfBirth.sendKeys("1980");

        // Finding the email field element
        WebElement emailField = driver.findElement(By.id("Email"));
        // Sending email to email field element
        emailField.sendKeys("alpha789@gmail.com"); // sending email to email field element

        // Finding the password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        // sending Password to password field element
        passwordField.sendKeys("Abc8909");
        // Finding the confirm password field element
        WebElement confirmPasswordField = driver.findElement(By.name("ConfirmPassword"));
        // sending Password to confirm password field element
        confirmPasswordField.sendKeys("Abc8909");

        // Finding the register button and clicking on it
        WebElement registerButton = driver.findElement(By.xpath("//button[@id='register-button']"));
        registerButton.click();

        // Verify the given text 'Your registration completed' from the requirements
        String expectedMessage = "Your registration completed";

        // Finding the given text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        String actualMessage = actualMessageElement.getText();
        //Validate expected and actual message
        Assert.assertEquals("Registration not successful", expectedMessage, actualMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}


