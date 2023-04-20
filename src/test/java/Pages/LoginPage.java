package Pages;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage extends CommonMethods { // We have created an object of this class in Login.java class to access it there.

                    // Page Factory Model

    public LoginPage(){ // This is a constructor
        PageFactory.initElements(driver , this); // This means I want to initialize all these web-elements through driver which are on this page
    }
    //WebElement usernameTextBox = driver.findElement(By.id("txtUsername"));
    @FindBy(id = "txtUsername") // This is used repetitively in Login.java
   public WebElement usernameTextBox;

   // WebElement passwordTextBox = driver.findElement(By.id("txtPassword"));
    @FindBy(id = "txtPassword") // This is used repetitively in Login.java
    public WebElement passwordTextBox;

    //WebElement loginBtn = driver.findElement(By.id("btnLogin"));
    @FindBy(id = "btnLogin") // This is used repetitively in Login.java
   public WebElement loginBtn;

   // WebElement welcomeIcon = driver.findElement(By.id("welcome"));
        @FindBy(id = "welcome")
    public WebElement welcomeIcon;

   // WebElement logoutLink = driver.findElement(By.xpath("//a[text()='Logout']"));
    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement logoutLink;
}
