package practiceStrings;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class Assignment2 extends SuperTestScript
{
 @Test
 public void testAssignment2() throws FileNotFoundException
 {
	 //Fetch All necessary data
	String userName=ExcelOperation.readData("Sheet3",1,0);
	String password=ExcelOperation.readData("Sheet3",1,1);
	//Create all necessary Pageobjects
	LoginPage lp=new LoginPage();
	HomePage1 hp=new HomePage1();
	//Convert testcases into scripts
	lp.enterUserName(userName);
	lp.enterPassword(password);
	lp.clickOnLoginButton();
	hp.writeStatusMessage();
	hp.clickOnPostButton();
 }
}
