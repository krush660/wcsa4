package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagepackage.loginpage;

public class ActiTImeInvalidLoginPage extends BaseTest{
	@Test
	public void validTest() throws IOException, InterruptedException {
		Flib flib = new Flib();

		loginpage lg = new loginpage(driver);

		String username = flib.readPropertyData(PROP_PATH, "Username");
		String password = flib.readPropertyData(PROP_PATH, "Password");

		lg.actiTimeInvalidLoginCread(username, password);

	}

}



