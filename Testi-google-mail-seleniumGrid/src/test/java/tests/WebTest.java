package tests;

import io.qameta.allure.Description;
import org.junit.Test;
import java.io.IOException;


	public class WebTest extends LoginSteps{	  

    @Test
    @Description("���� ��� �������� ����� gmail ����� selenium")
    public void open() throws IOException {                    
        
        openPageRedirectAndCheck("http://www.google.com/intl/ru/gmail/about/");
        //openPageRedirectAndCheck(PropertyManager.getProperty("webdriver.url"));       
        openLoginPageRedirectAndCheck("your@gmail.com");
        openPasswordPageRedirectAndCheck("your passw");        
        WriteLetter("sent@email", "Simbirsoft �������� �������");
       }   
    
}
	
	
	
	