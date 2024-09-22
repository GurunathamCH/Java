package Utilities;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericWrapper {
	public WebDriver Browser;
	public WebElement Eelement;

	public WebElement FindLink(String LinkName)
	{
	Eelement=Browser.findElement(By.xpath("//a//span[text()='"+LinkName+"']"));
	//a//span[text()='IT COURSES']
	//a//span[text()='HOME']
	return Eelement;
	}
	public void ClickOnWebElement()
	{
	Eelement.click();
	}

	public void OpenBrowser(String BrowserName)

	{//edge Edge EDGE



	if(BrowserName.equalsIgnoreCase("Edge"))

	{

	WebDriverManager.edgedriver().setup();

	Browser=new EdgeDriver();
	//Browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//Maximum waiting period for exception is 20 second

	}

	else if(BrowserName.equalsIgnoreCase("Chrome"))

	{WebDriverManager.chromedriver().setup();

	Browser=new ChromeDriver();

	//Browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}



	else if(BrowserName.equalsIgnoreCase("Opera"))

	{



	WebDriverManager.operadriver().setup();

	Browser=new OperaDriver();
	Browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}



	else if(BrowserName.equalsIgnoreCase("IE"))

	{



	WebDriverManager.iedriver().setup();

	Browser=new InternetExplorerDriver();
	Browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	else

	{

	WebDriverManager.chromedriver().setup();

	Browser=new ChromeDriver();
	Browser.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	}





	}



	public void NavigateToURL(String URL)

	{



	Browser.get(URL);







	}



	public void NavigateBackToPreviousURL()

	{

	Browser.navigate().back();





	}

	public void NavigateForwardToNextURL()

	{

	Browser.navigate().forward();





	}





	public void RefreshPage()

	{



	Browser.navigate().refresh();

	}



	public void CloseBrowser()

	{

	Browser.close();



	}



	public String GetCurrentURL()

	{





	return Browser.getCurrentUrl();

	}



	public String GetPageTitle()

	{



	return Browser.getTitle();

	}



	public String GetWindowHandleofParnetBrowser()

	{





	return Browser.getWindowHandle();

	}





	public Set<String> GetWindowHandlesofAllTheBrowsers()

	{





	return Browser.getWindowHandles();

	}



	public void MaximizeBrowser()

	{



	Browser.manage().window().maximize();

	}

	public void WaitforSomeSeconds(int Seconds) throws InterruptedException

	{


	    int S=Seconds*1000;
	Browser.manage().timeouts().wait(S);


	}
	public WebElement FindElementWithID(String ID)
	{
	//WebElement Name=Browser.findElement(By.id("websitePassword"));
	//web element commands

	//Name.click();
	//Name.sendKeys("hi");
	//Name.clear();
	//Name.equals(Name);
	//Name.findElement(By.xpath(""));
	//Name.findElements(By.tagName(""));
	//String a=Name.getAttribute("id");
	//Name.getClass();
	//Name.getCssValue(a);
	//Name.getTagName();
	//Name.getText();
	//Name.getSize();
	//Name.isDisplayed();
	//Name.isEnabled();
	//Name.isSelected();
	//int x=Name.getLocation().x;
	//int y=Name.getLocation().y;
	return Browser.findElement(By.id(ID));

	}
	public void ClickOnWeb_Element_with_XPATH(String Xpath) throws InterruptedException  //aaaa
	{
	Browser.findElement(By.xpath(Xpath)).click();

	}//aaa


	public void Enter_Values_Into_TextField(String Xpath,String Value)
	{

	Browser.findElement(By.xpath(Xpath)).sendKeys( Value);

	}
	public void Clear_Data_In_TextField(String Xpath)
	{
	Browser.findElement(By.xpath(Xpath)).clear();
	}
	public WebElement FindEelementByClass(String ClassName)
	{


	return Browser.findElement(By.className(ClassName)) ;
	}
	public WebElement FindElementByXpath(String Xpath)
	{

	return Browser.findElement(By.xpath(Xpath));
	}

	public boolean VerifyWebElementisDisplayingOrNot(String Xpath)

	{

		

		return Browser.findElement(By.xpath(Xpath)).isDisplayed();

	}



		

	public boolean VerifyWebElementisEnabledOrNot(String Xpath)

	{

		

		return Browser.findElement(By.xpath(Xpath)).isEnabled();

	}

		

	public boolean VerifyWebElementisSelectedOrNot(String Xpath)

	{

		

		return Browser.findElement(By.xpath(Xpath)).isSelected();

	}

	public int GetXaxisLocationofWebElement(String Xpath)

	{

		return Browser.findElement(By.xpath(Xpath)).getLocation().x;

	}

	public int GetYaxisLocationofWebElement(String Xpath)

	{

		return Browser.findElement(By.xpath(Xpath)).getLocation().y;

	}



	public String GetTageNameOfWebElement(String Xpath)

	{

		

	return Browser.findElement(By.xpath(Xpath)).getTagName();

	}



	public String GetAttributeValueOfWebElement(String Xpath,String Attribute)

	{

		

	return Browser.findElement(By.xpath(Xpath)).getAttribute(Attribute);

	}



	public List<WebElement> GetAlltheLinksInWebPage()

	{

	return Browser.findElements(By.tagName("a"));	

	}



	public List<WebElement> GetAlltheFramesInWebPagewithFrame()

	{

		

	return Browser.findElements(By.tagName("frame"));	

	}

	public List<WebElement> GetAlltheFramesInWebPagewithIFrame()

	{

		

	return Browser.findElements(By.tagName("iframe"));	

	}





	public List<WebElement> GetAlltheImagesInWebPage()

	{

		

	return Browser.findElements(By.tagName("image"));	

	}

	public List<WebElement> GetAllInputTextFieldsInWebPage()

	{

		

	return Browser.findElements(By.xpath("//input[@type='text']"));	



	}

	public List<WebElement> GetAllPasswordTextFieldsInWebPage()

	{

		

	return Browser.findElements(By.xpath("//input[@type='password']"));	



	}

	public List<WebElement> GetAllEmailTextFieldsInWebPage()

	{

		

	return Browser.findElements(By.xpath("//input[@type='email']"));	



	}

	public List<WebElement> GetAllSubmitButtonsinWebPage()

	{

		

	return Browser.findElements(By.xpath("//input[@type='submit']"));	



	}

	public List<WebElement> GetAllResetButtonsinWebPage()

	{

		

	return Browser.findElements(By.xpath("//input[@type='reset']"));	



	}

	public List<WebElement> GetAllCancelButtonsinWebPage()

	{

		

	return Browser.findElements(By.xpath("//input[@type='cancel']"));	



	}

	public List<WebElement> GetAlltheRadioButtonsInWebPage()

	{

		

	return Browser.findElements(By.xpath("//input[@type='radio']"));	



	}

	public List<WebElement> GetAlltheCheckBoxessInWebPage()

	{

		

	return Browser.findElements(By.xpath("//input[@type='checkbox']"));	



	}

	public List<WebElement> GetAlltheTablesInWebPagewithIFrame()

	{

		

	return Browser.findElements(By.tagName("table"));	

	}

	public List<WebElement> GetAlltheDropdownsInWebPage()

	{

	return Browser.findElements(By.tagName("select"));	

	}
	public WebElement FindElementWithPlaceHolder(String PlaceHoldrValue)
	{
		return Browser.findElement(By.xpath("//input[@placeholder='"+PlaceHoldrValue+"']"));
		
	}
}
