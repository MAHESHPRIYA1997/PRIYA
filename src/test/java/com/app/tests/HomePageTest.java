package com.app.tests;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.page.BasePage;
import com.app.page.HomePageObjects;

public class HomePageTest {

	HomePageObjects homePage;
	BasePage bp;

	int rand = new Random().nextInt(5000000);
	String email = "priya" + rand + "@gmail.com";

	public HomePageTest() {
		homePage = new HomePageObjects();
		bp = new BasePage();
	}

	@Test
	public void verifyTabs() {
		Assert.assertTrue(homePage.elementFound(homePage.women()));
		Assert.assertTrue(homePage.elementFound(homePage.dress()));
		Assert.assertTrue(homePage.elementFound(homePage.tshirt()));
	}

	@Test
	public void verifyclick() {
		homePage.womenclick();
		String getTitle1 = bp.getTitlte();
		Assert.assertEquals(getTitle1, "Women - My Store");
		homePage.dressclick();
		String getTitle2 = bp.getTitlte();
		Assert.assertEquals(getTitle2, "Dresses - My Store");
		homePage.tshirtclick();
		String getTitle3 = bp.getTitlte();
		Assert.assertEquals(getTitle3, "T-shirts - My Store");

	}

	@Test
	public void verifyount() {
		homePage.womenclick();
		int act1 = homePage.womencount();
		int exp1 = homePage.getwomencount();
		Assert.assertTrue(act1 == exp1, "count mismatch");

		homePage.dressclick();
		int act2 = homePage.dresscount();
		int exp2 = homePage.getdresscount();
		Assert.assertTrue(act2 == exp2, "count mismatch");

		homePage.tshirtclick();
		int act3 = homePage.tshirtcount();
		int exp3 = homePage.gettshirtcount();
		Assert.assertTrue(act3 == exp3, "count mismatch");

	}

	@Test
	public void verifysize() {
		Assert.assertTrue(homePage.isElementVisible(homePage.verfiysize()));

	}

	@Test
	public void verifyemail() {

		homePage.setTextemail(email);
		String msg = homePage.sucess();

		Assert.assertTrue(msg.contains("You have successfully subscribed to this newsletter"), "successfully");

	}

}
