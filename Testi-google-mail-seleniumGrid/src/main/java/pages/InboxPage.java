package pages;

import io.qameta.allure.Step;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;

public class InboxPage extends BasePage{
       
	public InboxPage() throws MalformedURLException {
		super();
		// TODO Auto-generated constructor stub
	}


	String topicCount;	
      
    /**
     * ����������� �������� ������ "�������� ������"
     */
    @FindBy(xpath = "//*[@id=\":9x\"]/div/div")
    private WebElement WriteLetterBtn;		
    
    /**
     * ����������� �������� ���� ����
     */
    @FindBy(xpath = "//*[@id=\":gq\"]")
    private WebElement WhoomField;	
    
    /**
     * ����������� �������� ���� ���� ������
     */
    @FindBy(xpath = "//*[@id=\":g8\"] ")
    private WebElement TopicField;	
    
    /**
     * ����������� �������� ���� ����� ������
     */
    @FindBy(xpath = "//*[@id=\":he\"]")
    private WebElement TextField;	
    
    /**
     * ����������� �������� ���� ������ ���������
     */
    //   //*[@id=":fv"]     ���������
    @FindBy(xpath = "//*[contains(text(), '���������')]/..")
    private WebElement SendBtn;
    
    /**
     * ����������� �������� ���� ������ �����
     */
    //   //*[@id="gb_71"]      �����
    @FindBy(xpath = "//*[contains(text(), '�����')]/..")
    private WebElement OutBtn;
   
    
       
    /**
     * ����� ��� ������ ���� ���������
     * @return 
     */
    @Step("������������ ���������� ����� � ����� {0}")  
    public String findLetters(String topic) {
    	RemoteWebDriver driver = getChromeDriver();    	   	
    	int xpathCount = driver.findElements(By.xpath("//*[contains(text(), 'Simbirsoft �������� �������')]")).size();  	
    	String topicCount = String.valueOf(xpathCount);
    	return topicCount;        
    	}
    
    
    /**
     * ����� ��� ������������� ������� ������ �������� ������
     */
    @Step("�������� �� ������ �������� ������")
    public void clickWriteLetterBtn() {
    	checkElementOnPage(WriteLetterBtn);
    	WriteLetterBtn.click(); 
    	} 
    
    
    /**
     * ����� ��� ����� ���������� ������
     */
    @Step("������ ��������� ������: ����, ����, ����� ������ {0}, {1}, {2} � �������� ������ ���������")
    public void TopicWriteLetterBtn(String whoom, String topic) {
    	checkElementOnPage(WhoomField);
    	checkElementOnPage(TopicField);
    	checkElementOnPage(TextField);
        WhoomField.sendKeys(whoom);
        TopicField.sendKeys(topic);
        TextField.sendKeys(topicCount);  
    	
    	SendBtn.click(); 
    	} 
    
    
    /**
     * ����� ��� ������� ������ �����
     */
    @Step("�������� �� ������ �������� ������")
    public void clickOutBtn() {
    	checkElementOnPage(WriteLetterBtn);
    	OutBtn.click(); 
    	} 
    
    }



