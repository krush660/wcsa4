package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class user {

	@FindBy(xpath = "//a[@class='content users']")
	private WebElement users;
	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement createNewUser;
	@FindBy(name = "username")
	private WebElement username;
	@FindBy(xpath = "//input[@name='passwordText']")
	private WebElement password;
	@FindBy(name = "passwordTextRetype")
	private WebElement retypepassword;
	@FindBy(name = "firstName")
	private WebElement firstname;
	@FindBy(name = "lastName")
	private WebElement lastname;
	@FindBy(xpath = "//input[@value='   Create User   ']")
	private WebElement createUser;
	@FindBy(xpath = "//input[@value='      Cancel      ']")
	private WebElement cancelButton;

	public user(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// getters Method

	public WebElement getUsers() {
		return users;
	}

	public WebElement getCreateNewUser() {
		return createNewUser;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRetypepassword() {
		return retypepassword;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCreateUser() {
		return createUser;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	// Operational Method
	public void user()
	{
		users.click();
		
	}
	public void createnewUser()
	{
		createNewUser.click();
		
	}

	public void validUsn(String validUsername)
	{
		username.sendKeys(validUsername);
	}

	public void validPwd(String validpassword) 
	{
		password.sendKeys(validpassword);

	}
	public void retypePassword(String retypePassword)
	{
		retypepassword.sendKeys(retypePassword);
		
	}
	
	public void fName(String fname)
	{
		firstname.sendKeys(fname);
	

	}
	public void lastName(String lname) 
	{
		lastname.sendKeys(lname);
		
	}
	public void submitButton()
	{
		createUser.click();
		
	}
	public void cancelButton() 
	{
		cancelButton.click();
		
	}

}


