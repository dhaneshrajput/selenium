package generic;

import org.testng.Reporter;

public class  Webgenric extends Basetest {
	
public static void verifytitle(String expectedtitle) {
String actualtitle = driver.getTitle();
if (expectedtitle.equals(actualtitle))
	Reporter.log("home page is displayed",true);
else
	Reporter.log("home page not displayed",true);
}

public static void verifyurl(String expectedurl) {
String actualurl = driver.getCurrentUrl();
if (expectedurl.equals(actualurl))
	Reporter.log("home page is displayed",true);
else
	Reporter.log("home page not displayed ",true);
}
}
