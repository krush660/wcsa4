package pagepackage;

import java.io.IOException;

import genericPackage.BaseTest;
import genericPackage.Flib;
import testPackage.ActiTImeInvalidLoginPage;

public class createanuser extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException {

		BaseTest bt = new BaseTest();
		  bt.equals(bt);
		 ActiTimeValidLoginpage act = new ActiTImeInvalidLoginPage(driver);

		Flib flib = new Flib();

		String usn = flib.readPropertyData(PROP_PATH, "Username");
		String pwd = flib.readPropertyData(PROP_PATH, "Password");

		act.ActiTImeInvalidLoginPage(usn, pwd);

		Thread.sleep(2000);
		 homepage hp = new homepage(driver);
         
		 
	}

}



