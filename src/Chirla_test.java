
public class Chirla_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  DesiredCapabilities    Cap = new DesiredCapabilities();
	        
	        Cap.setBrowserName("chrome");
	        Cap.setPlatform(Platform.WINDOWS);
	        
	        ChromeOptions COptions = new ChromeOptions();
	        COptions.merge(Cap);
	        
	        String HubUrl= "http://192.168.29.62:4444/wd/hub"; 
	        
	        WebDriver Driver = new RemoteWebDriver(new URL(HubUrl),COptions);
	        
	        
	        Driver.get("https://www.amazon.in/");
	        
	        System.out.println(Driver.getTitle());
	        
	        Driver.quit();
		
	}

}
