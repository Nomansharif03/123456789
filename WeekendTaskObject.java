package WeekendTaskObject;

import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class WeekendTaskObject {
	//All Locators
	   @FindBy(xpath="//input[@id='username']")
    	WebElement WriteYourEmail;
	
		@FindBy(xpath="//*[text()='Continue']")
		WebElement ClickContinoueButton;
		
		@FindBy(xpath="//input[@id='password']")
		WebElement WriteYourPassword;
		
		@FindBy(xpath="//span[text()='Log in']")
		WebElement ClickSignUpButton;
		
		@FindBy(xpath="(//span[@style='--icon-primary-color:currentColor; --icon-secondary-color: inherit;'])[1]")
    	WebElement ClickCreateButton;
		
		@FindBy(xpath="//span[text()='Create board']")
    	WebElement ClickCreate;
		
		@FindBy(xpath="//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")
    	WebElement WriteTheTitleBoard;
		
		@FindBy(xpath="//button[@class='G2lWjDVJsvar3H Ts+YceGnvTbKoG HPCwi137Em5EYI JIXQq8gDYY04N6']")
    	WebElement ClickCreateButton1;
		
		@FindBy(xpath="//input[@class='list-name-input']")
    	WebElement WriteFirstList;
		
		@FindBy(xpath="//input[@class='list-name-input']")
    	WebElement WriteSeconedList;
		
		
		@FindBy(xpath="(//span[@class='js-add-a-card'])[2]")
		WebElement AddCardToList;
		
		@FindBy(xpath="//textarea[@class='list-card-composer-textarea js-card-title']")
		WebElement AddCardTitleList;
		
		@FindBy(xpath="//div[@class='list-card-details js-card-details']")
		WebElement ClickCardTitleList;
		
		@FindBy(xpath="//a[@class='button-link js-move-card']")
		WebElement ClickMoveButton;
		
		@FindBy(xpath="//select[@class='js-select-list']")
		WebElement ClickTheButton;
		
		@FindBy(xpath="//span[@class='list-card-title js-card-name']")
		WebElement ClickTheCardTitleButton;
		
		@FindBy(xpath="//a[@class='button-link js-archive-card']")
		WebElement ClickArchieveButton;
		
		@FindBy(xpath="//a[@class='button-link js-delete-card hide negate']")
		WebElement ClickDeleteButton;
		
		
		//ALL Methods
		WebDriver driver;
		Random random;
		String Random;
		
		public WeekendTaskObject(WebDriver driver1){
			driver=driver1;
			PageFactory.initElements(driver1,this);}
		
        public void Login() throws Exception {
        	WriteYourEmail.sendKeys("");
        	Thread.sleep(2000);
        	ClickContinoueButton.click();
        	Thread.sleep(2000);
        	WriteYourPassword.sendKeys("Pakistan@031");
        	Thread.sleep(2000);
        	ClickSignUpButton.click();
        	Thread.sleep(2000);
        }
        public void CreateBoard() throws Exception {
        	Thread.sleep(3000);
        	ClickCreateButton.click();
        	Thread.sleep(2000);
        	ClickCreate.click();
        	Thread.sleep(2000);
        	random = new Random();
        	String string = RandomStringUtils.randomAlphabetic(8); 
        	WriteTheTitleBoard.sendKeys(string);
        	Thread.sleep(2000);
        	ClickCreateButton1.click();
        	Thread.sleep(3000);
        }
        	public void AddTwoLists() throws Exception {
        	Thread.sleep(3000);
        	String string1 = RandomStringUtils.randomAlphabetic(6);
        	WriteFirstList.sendKeys(string1 + Keys.ENTER);
        	Thread.sleep(3000);
        	String string2 = RandomStringUtils.randomAlphabetic(6);
        	WriteSeconedList.sendKeys(string2 + Keys.ENTER);

        }
        	public void AddCardTolist() throws Exception {
        		String string3 = RandomStringUtils.randomAlphabetic(6);
        		Thread.sleep(3000);
        		AddCardToList.click();
        		AddCardTitleList.sendKeys(string3 + Keys.ENTER);
            	Thread.sleep(3000);
        	}
        	public void MoveCardFromList1toList2() throws Exception {
        		Actions builder = new Actions(driver);
        		WebElement from = driver.findElement(By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']"));
        		WebElement to = driver.findElement(By.xpath("(//span[@class='js-add-a-card'])[2]"));	
        		builder.dragAndDrop(from, to).perform();
        	}
        	public void EditTheCardInList2() throws Exception
        	{
        		Thread.sleep(2000);
        		ClickTheCardTitleButton.sendKeys("Hyehye");
        	}
        	public void DeleteTheCardFromList2() throws Exception
        	{
        		ClickTheCardTitleButton.click();
        		Thread.sleep(2000);
        		ClickArchieveButton.click();
        		Thread.sleep(2000);
        		ClickDeleteButton.click();
        		Thread.sleep(2000);
        	}
        	}

