package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Pom.HomePage;
import Pom.Loginpage;
import generic.Basetest;
import generic.Readexcel;
import generic.Webgenric;

public class ValidLogin extends Basetest{
  @Test
  public void validlogin() throws InterruptedException, EncryptedDocumentException, IOException {
	  HomePage hp = new HomePage(driver);
	  Readexcel r = new Readexcel();
	   String username = r.getdataexcel( "Sheet1",0,0);
	    String password = r.getdataexcel("Sheet1",1,0);
	  hp.getUsername().sendKeys(username);
	  hp.getPassword().sendKeys(password);
	  hp.getLogin().click();
      Thread.sleep(5000);
      Webgenric wg = new Webgenric();
      wg.verifytitle("actiTIME - Enter Time-Track");
      Thread.sleep(5000);
      Loginpage lp = new Loginpage(driver);
      lp.getLogout().click();
      Thread.sleep(5000);
  }
}
