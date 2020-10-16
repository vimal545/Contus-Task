package org.pojo;


import java.util.List;

import org.cts.B;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage1 extends B{

	public GooglePage1() {
		PageFactory.initElements(driver, this);	}
	
	
	
	
	@FindBy(name="q")
	private WebElement serach;

@FindBy(xpath="//*[@class='erQe']")
private List<WebElement> listofsuggestions;


	public List<WebElement> getListofsuggestions() {
	return listofsuggestions;
}


	public WebElement getSerach() {
		return serach;
	}
	
	
	
}
