package pages;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.MalformedURLException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
       public LoginPage() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}
       

	/**
     * ����������� �������� ���� ����� ������
     */	 
    @FindBy(xpath = "//*[contains(@id, 'identifierId')]")    
    private WebElement loginField;    
        
    /**
     * ����������� �������� ������ ����� � �������
     */  
    @FindBy(xpath = "//*[@id=\"identifierNext\"]/div/button/span")
    //@FindBy(xpath = "//*[contains(text(), '�����')]/..")
    private WebElement loginBtn;

	private String login;
    
    /**
     * ����� ��� ����� ������
     */
    @Step("������� input ��� ����� ������ � ������ �����")    
    public void inputLogin(String login) {
    	//Assert.assertTrue("�� ������ input ��� ����� ������", loginField.isDisplayed());
    	checkElementOnPage(loginField);
        loginField.sendKeys(login); }
    
    
    @Step("������� input ��� ����� ������ � ������ �����")    
    public void inputLoginByKey(String login) {
    	//Assert.assertTrue("�� ������ input ��� ����� ������", loginField.isDisplayed());
    	checkElementOnPage(loginField);
    	String login2 = login.concat("\t\t\n");
    	int len = login2.length();
    	//char[] loginChar=new char[l];
    	
    	char loginChar2;
    	for(int i =0; i < len; i++) {
    		loginChar2 = login2.charAt(i);
    		String charStr = String.valueOf(loginChar2);    	   		
            loginField.sendKeys(charStr);
            waitFor(i*5);            
    	}
    	waitFor(12);   
    	//loginField.sendKeys("\n");    	
    }
        
    
    
    
    /**
     * ����� ��� ������������� ������� ������ ����� ��� �������� �� �������� ����� ������
     */
    @Step("������� � �������� ������ ����� �� �������� ����� ������")  
    public void clickLoginBtn() {
    	//Assert.assertTrue("�� ������ input ��� ����� ������", loginBtn.isDisplayed());
    	waitFor(5); 
    	checkElementOnPage(loginBtn);
    	loginBtn.click(); } 
    }
