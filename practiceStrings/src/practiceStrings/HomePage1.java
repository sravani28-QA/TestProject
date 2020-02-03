package practiceStrings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 
{
 @FindBy(className="_1mf _1mj")
 private WebElement statusMessage;
 @FindBy(className="_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft _42fr")
 private WebElement postButton;
 public HomePage1()
 {
	 PageFactory.initElements(SuperTestScript.driver,this);
 }
 public void writeStatusMessage()
 {
	 statusMessage.sendKeys("hello"); 
 }
 public void clickOnPostButton()
 {
	 postButton.click(); 
 }
}
