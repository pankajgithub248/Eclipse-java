package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LearningTask {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
        
        // Define the URL you want to open.
        String url = "https://www.itv.com";
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get(url);
       //driver.findElement(By.xpath("//*[@aria-label='Search icon']")).click();
       Thread.sleep(8000);
     //  WebElement button=driver.findElement(By.xpath("//button[text()='Accept All']"));
       WebElement button =driver.findElement(By.xpath("//button[@id='cassie_accept_all_pre_banner']"));
        if (button!=null) {
        	button.click();
        	System.out.println("button clicked");
        	}
        else {
			System.out.println("Already accept cookies");
		}
        driver.findElement(By.xpath("//*[@aria-label='Search icon']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Search for shows on ITVX']")).sendKeys("12 monkey");
        Thread.sleep(8000);
        driver.findElement(By.xpath("//div[@class='cp_result-item__body']//p[@class='cp_result-item__title']//strong[text()='12 Monkey']")).click();
        driver.findElement(By.xpath("//button[@id='cp_tab__button-2']")).click();
      driver.findElement(By.xpath("//div[@class='cp_tile__overlay']//h2[text()='1. Year of the Monkey']")).click();
        //String[] videotitle= {"The monkey:Series 2:Episode 1","The monkey:Series 2:Episode 2","The monkey:Series 2:Episode 3"};
        
        
         
			
		}

       
    }
