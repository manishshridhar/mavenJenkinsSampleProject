package docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities().chrome();
		
		RemoteWebDriver driver = new RemoteWebDriver(dc);

	}

}
