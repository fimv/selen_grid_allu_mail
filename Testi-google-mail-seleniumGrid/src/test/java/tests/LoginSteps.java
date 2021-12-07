package tests;

import java.net.MalformedURLException;

import io.qameta.allure.Step;
import pages.PasswordPage;
import pages.FirstPage;
import pages.InboxPage;
import pages.LoginPage;


public class LoginSteps {

   @Step("��������� �������� gmail � ��������� �� �������� ������")
   public void openPageRedirectAndCheck(String goTo) throws MalformedURLException {
   FirstPage page = new FirstPage();
   page.goTo(goTo); 
   page.clickFirstLoginBtn();  }
   
   @Step("��������� �������� ����� ������ � ��������� �� �������� ����� ������")
    public void openLoginPageRedirectAndCheck(String login) throws MalformedURLException {
    LoginPage page = new LoginPage();
    page.inputLoginByKey(login);     
    }
   
   @Step("��������� �������� ����� ������ � ��������� �� �������� ��������� ����� (profile)")
   public void openPasswordPageRedirectAndCheck(String password) throws MalformedURLException {
   PasswordPage page = new PasswordPage();
   page.inputPasswd(password);
   page.clickPaswordBtn();  }
    
   
   @Step("������� ���������� ��������� ���� ������ � ����� ")
   public void WriteLetter(String whoom, String topic) throws MalformedURLException {
   InboxPage page = new InboxPage();
   page.findLetters(topic);
   page.clickWriteLetterBtn();   
   page.TopicWriteLetterBtn(whoom, topic);
   page.clickOutBtn();  
   }
                      
}
    
   
