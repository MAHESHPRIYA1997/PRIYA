 package com.app.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {

	@FindBy(xpath = "//div/ul/li/a[@title=\"Women\"]")
	private WebElement women;

	@FindBy(xpath = "//div/ul/li/a[@title=\"Dresses\"]")
	private WebElement dress;

	@FindBy(xpath = "//div/ul/li/a[@title=\"T-shirts\"]")
	private WebElement tshirt;

	@FindBy(xpath = "//div/ul/li/a[@title=\"Women\"]")
	public String womenclick;
	
	@FindBy(xpath = "//*[@class=\"heading-counter\"]")
	public WebElement countwomen;
	
	@FindBy(xpath = "//ul[@class=\"product_list grid row\"]/li")
	public List<WebElement> firstproduct;
	
	@FindBy(xpath = "//*[@class=\"heading-counter\"]")
	public WebElement countdress;
	
	@FindBy(xpath = "//*[@class=\"product_list grid row\"]/li")
	public List<WebElement> secondproduct;
	
	@FindBy(xpath = "//*[@class=\"heading-counter\"]")
	public WebElement counttshirt;
	
	@FindBy(xpath = "//*[@class=\"product_list grid row\"]/li")
	public List<WebElement> thirdproduct;

	@FindBy(xpath = "//ul[@id=\"ul_layered_id_attribute_group_1\"]")
	public WebElement size;
	
	@FindBy(id = "newsletter-input")
	public WebElement emaillink;
	
	@FindBy(xpath = "//p[@class=\"alert alert-success\"]")
	public WebElement sucessmsg;
	
	@FindBy(name = "submitNewsletter")
	public WebElement btn;
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public WebElement women() {
		return women;
	}

	public WebElement dress() {
		return dress;
	}

	public WebElement tshirt() {
		return tshirt;
	}

	public void womenclick() {
		women.click();        
		
	}  
	public void dressclick() {
		 dress.click();;
	}

	public void tshirtclick() {
		tshirt.click();
	}
    
	
	
	public int womencount() {
		String msg1=countwomen.getText();
		String[] arr1= msg1.split(" ");
		String number1=arr1[2];
		int num1=Integer.parseInt(number1);
		return num1; 
	}
	
	
	public int getwomencount() {
		
		return firstproduct.size();
		
	}
	
	public int dresscount() {
		String msg2=countdress.getText();
		String[] arr2= msg2.split(" ");
		String number2=arr2[2];
		int num2=Integer.parseInt(number2);
		return num2; 
	}
	
	
	public int getdresscount() {
		
		return secondproduct.size();
		
	}
	public int tshirtcount() {
		String msg3=counttshirt.getText();
		String[] arr3= msg3.split(" ");
		String number3=arr3[2];
		int num3=Integer.parseInt(number3);
		return num3; 
	}
	
	
	public int gettshirtcount() {
		
		return thirdproduct.size();
		
	}
	
	
	public void setTextemail(String email) {
		setText(emaillink, email);
		btn.click();
		
	}
	
	public WebElement verfiysize() {
		return size;
	}
	 
}
