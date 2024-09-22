package TestScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utilities.GenericWrapper;

public class Verify_Test {
@Test
@Parameters({"Browser"})
	public void Test(String Browser){
	SoftAssert SA=new SoftAssert();
		// TODO Auto-generated method stub
GenericWrapper GW=new GenericWrapper();
GW.OpenBrowser(Browser);
GW.NavigateToURL("https://www.horamait.com");
GW.FindElementWithPlaceHolder("Name as");
Boolean Val=GW.FindElementWithPlaceHolder("Name").isDisplayed();
SA.assertTrue(Val);
SA.assertAll();

	}

}
