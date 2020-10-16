package org.stepdef;

import java.net.MalformedURLException;

import org.cts.B;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends B {

	@Before
	public void bf() throws Exception {
		String platform = System.getProperty("platform", "Desktop");
		String browser = System.getProperty("browser", "chrome");
		getBrowser(platform, browser);

	}

	@After
	public void afe(Scenario sc) {

		if (sc.isFailed()&&driver!=null) {

			TakesScreenshot tk = (TakesScreenshot) driver;
			byte[] ss = tk.getScreenshotAs(OutputType.BYTES);
			sc.embed(ss, "image/png");
		}
	}

}
