package practiceStrings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 

{
	
 @FindBy(id="email")
 private WebElement usernameTextField;
 @FindBy(id="pass")
 private WebElement passwordTextField;
 @FindBy(xpath="//input[@type='submit']")
 private WebElement loginButton;
 public LoginPage() 
 {
	PageFactory.initElements(SuperTestScript.driver,this);
 }
 public void enterUserName(String userName)
 {
	 usernameTextField.sendKeys(userName);
 }
 public void enterPassword(String password)
 {
	 passwordTextField.sendKeys(password); 
 }
 public void clickOnLoginButton()
 {
	 loginButton.click();
	 
 }
}
