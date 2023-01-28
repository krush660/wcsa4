package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	@FindBy(xpath="//select[@name='usersSelector.selectedUser']")private WebElement dropdown;
	@FindBy(xpath="//a[.='Create new tasks']")private WebElement inserttask;
	@FindBy(xpath="//a[.='Logout']")private WebElement logout;
	@FindBy (xpath="(//img[@class='sizer'])[3]") private WebElement user;
	@FindBy(xpath="(//img[@class='sizer'])[1]")private WebElement tasks;
	@FindBy(xpath="//a[.='Projects & Customers']")private WebElement project;
	
	
	//constructor
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//Utiliazation
	
	public WebElement getdropdown()
	{
		return dropdown;
	}
	public WebElement getinserttask()
	{
		return inserttask;
	}
	public WebElement getlogout()
	{
		return logout;
	}
	public WebElement gettasks()
	{
		return tasks;
	}
	public void createUser()
	{
		user.click();
	}
	public void dropDown()
	{
		dropdown.click();
	}
	
	//logout
	public void log()
	{
		logout.click();
	}
	public void task()
	{
		tasks.click();
	}
	public void project()
	{
		project.click();
	}
}
	
		
	


