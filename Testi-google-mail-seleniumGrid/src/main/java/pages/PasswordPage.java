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

public class PasswordPage extends BasePage{
       
    public PasswordPage() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	/**
     * ����������� �������� ���� ����� ������
     */
    @FindBy(xpath = "//*[contains(text(), '������� ������')]/..")
    //@FindBy(xpath = "//*[//*[@id=\"password\"]/div[1]/div/div[1]/input]")
    private WebElement passwdField;
    
    /**
     * ����������� �������� ������ ����� � �������
     */
    @FindBy(xpath = "//*[contains(text(), '�����')]/..")
    private WebElement loginPaswordBtn;
   
    
       
    /**
     * ����� ��� ����� ������
     */
    @Step("������� ������� input ��� ����� ������ � �������� ������")  
    public void inputPasswd(String passwd) {
    	checkElementOnPage(passwdField);
    	passwdField.sendKeys(passwd); 
         
    }
    /**
     * ����� ��� ������������� ������� ������ ����� � �������
     */
    @Step("������� � �������� ������ ����� �� �������� ����� ������")
    public void clickPaswordBtn() {
    	loginPaswordBtn.click();
    } 
}


