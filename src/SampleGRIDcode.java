

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver; 

public class SampleGRIDcode {
	
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

	/*	1. regrister hub in local cmd: 
			cd C:\Murali\Java-Learn\Selenium\Jar
			java -jar selenium-server-standalone-3.141.59.jar -role hub
			
			-- hub created in this cmd will take to 2nd step to register in creating hub 
output: 

C:\Murali\Java-Learn\Selenium\Jar>java -jar selenium-server-standalone-3.141.59.jar -role hub
10:08:59.754 INFO [GridLauncherV3.parse] - Selenium server version: 3.141.59, revision: e82be7d358
10:08:59.973 INFO [GridLauncherV3.lambda$buildLaunchers$5] - Launching Selenium Grid hub on port 4444
2021-02-14 10:09:00.732:INFO::main: Logging initialized @1378ms to org.seleniumhq.jetty9.util.log.StdErrLog
10:09:01.882 INFO [Hub.start] - Selenium Grid hub is up and running
10:09:01.883 INFO [Hub.start] - Nodes should register to http://10.104.66.247:4444/grid/register/
10:09:01.884 INFO [Hub.start] - Clients should connect to http://10.104.66.247:4444/wd/hub
10:20:58.157 INFO [DefaultGridRegistry.add] - Registered a node http://10.104.66.247:4071
10:22:10.360 INFO [DefaultGridRegistry.add] - Registered a node http://10.104.66.247:30855
			
			
			
			
			-- us
		2. register at least 2 node in local cmd:
				cd C:\Murali\Java-Learn\Selenium\Jar
				java -Dwebdriver.chrome.driver="C:\\Murali\\Java-Learn\\Selenium\\Browser_driver\\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -hub http://10.104.66.247:4444/grid/register/
		
		
		
1st node:		
C:\Murali\Java-Learn\Selenium\Jar>java -Dwebdriver.chrome.driver="C:\\Murali\\Java-Learn\\Selenium\\Browser_driver\\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -hub http://10.104.66.247:4444/grid/register/
11:44:44.392 INFO [GridLauncherV3.parse] - Selenium server version: 3.141.59, revision: e82be7d358
11:44:44.586 INFO [GridLauncherV3.lambda$buildLaunchers$7] - Launching a Selenium Grid node on port 21595
2021-02-14 11:44:45.489:INFO::main: Logging initialized @1418ms to org.seleniumhq.jetty9.util.log.StdErrLog
11:44:45.787 INFO [WebDriverServlet.<init>] - Initialising WebDriverServlet
11:44:45.884 INFO [SeleniumServer.boot] - Selenium Server is up and running on port 21595
11:44:45.885 INFO [GridLauncherV3.lambda$buildLaunchers$7] - Selenium Grid node is up and ready to register to the hub
11:44:46.220 INFO [SelfRegisteringRemote$1.run] - Starting auto registration thread. Will try to register every 5000 ms.
11:44:46.853 INFO [SelfRegisteringRemote.registerToHub] - Registering the node to the hub: http://10.104.66.247:4444/grid/register

2nd node:


C:\Murali\Java-Learn\Selenium\Jar>java -Dwebdriver.chrome.driver="C:\\Murali\\Java-Learn\\Selenium\\Browser_driver\\chromedriver.exe" -jar selenium-server-standalone-3.141.59.jar -role node -hub http://10.104.66.247:4444/grid/register/
11:45:18.370 INFO [GridLauncherV3.parse] - Selenium server version: 3.141.59, revision: e82be7d358
11:45:18.557 INFO [GridLauncherV3.lambda$buildLaunchers$7] - Launching a Selenium Grid node on port 13846
2021-02-14 11:45:19.438:INFO::main: Logging initialized @1360ms to org.seleniumhq.jetty9.util.log.StdErrLog
11:45:19.719 INFO [WebDriverServlet.<init>] - Initialising WebDriverServlet
11:45:19.812 INFO [SeleniumServer.boot] - Selenium Server is up and running on port 13846
11:45:19.812 INFO [GridLauncherV3.lambda$buildLaunchers$7] - Selenium Grid node is up and ready to register to the hub
11:45:20.113 INFO [SelfRegisteringRemote$1.run] - Starting auto registration thread. Will try to register every 5000 ms.
11:45:20.790 INFO [SelfRegisteringRemote.registerToHub] - Registering the node to the hub: http://10.104.66.247:4444/grid/register
11:45:21.108 INFO [SelfRegisteringRemote.registerToHub] - The node is registered to the hub and ready to use


3rd step: run below java code as usual
			*/		
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Murali\\Java-Learn\\Selenium\\Browser_driver\\chromedriver.exe");  
		DesiredCapabilities Cap = new DesiredCapabilities();

		Cap.setBrowserName("chrome");
		Cap.setPlatform(Platform.WINDOWS);
		
		ChromeOptions COptions = new ChromeOptions();
		
		COptions.merge(Cap);
		String HubUrl="http://10.104.66.247:4444/wd/hub";
		WebDriver Driver = new RemoteWebDriver(new URL(HubUrl),COptions);
		
//		WebDriver driver = new RemoteWebDriver(new URL("http://www.example.com"), firefoxOptions);
		
		Driver.get("https://www.amazon.in/");
		System.out.println(Driver.getTitle());
		
		Driver.quit();
	}

}
