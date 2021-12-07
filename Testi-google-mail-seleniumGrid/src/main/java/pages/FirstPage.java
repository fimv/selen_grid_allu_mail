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

public class FirstPage extends BasePage {
	
	
	public FirstPage() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
     * ����������� �������� ���� ������������
     */  
    @FindBy(xpath = "//*[contains(text(), '�����')]/..")
    private WebElement firstloginBtn;    
       
    
    
    //@Step("������� � �������� ������ ����� �� ������ �������� g-mail")
    public void clickFirstLoginBtn() {
    checkElementOnPage(firstloginBtn);
    //Assert.assertTrue("�� ������� ������ �����", firstloginBtn.isDisplayed());
    firstloginBtn.click(); 
    } 

}
