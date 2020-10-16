package org.stepdef;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.cts.B;
import org.openqa.selenium.WebElement;
import org.pojo.GooglePage1;

import cucumber.api.java.en.*;

public class GoogleStepsClass extends B {
	GooglePage1 g;

	@Given("user has to be there in google page")
	public void user_has_to_be_there_in_google_page() {
		launchUrl("https://www.google.com/");
	}
	//
	// @When("User has to enter the text automation in search field")
	// public void
	// user_has_to_enter_the_text_automation_in_search_field(io.cucumber.datatable.DataTable
	// dataTable) {
	// GooglePage1 g=new GooglePage1();
	// List<String> li = dataTable.asList();
	// type(g.getSerach(), li.get(0));
	// }

	@When("User has to enter the text {string} in search field")
	public void user_has_to_enter_the_text_in_search_field(String s1) {
		g = new GooglePage1();

		type(g.getSerach(), s1);

	}

	@Then("User is validating the suggestions which is matching with the entered value in search bar")
	public void user_is_validating_the_suggestions_which_is_matching_with_the_entered_value_in_search_bar() {

		List<WebElement> li = g.getListofsuggestions();
		assertTrue(li.size() > 0);
		for (WebElement x : li) {
			String text = x.getText();
			if (text.contains(g.getSerach().getAttribute("value"))) {
				System.out.println("Suggestions contains automation");
			} else {

				System.out.println("Suggestions are not contains the word automation");
			}
		}
	}

}
