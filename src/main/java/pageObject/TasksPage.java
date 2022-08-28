package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TasksPage {

  public WebDriver driver;

  By slot1 = By.xpath("//input[@id='answer1']");
  By textToTrim = By.xpath("//ol/li[2]");
  By nameInput = By.xpath("//input[@id='name']");
  By select = By.xpath("//select[@id='occupation']");
  By blueBoxes = By.xpath("//span[@class='bluebox']");
  By slot4 = By.xpath("//input[@id='answer4']");
  By link = By.xpath("//body/a[3]");
  By redBox = By.xpath("//span[@id='redbox']");
  By slot6 = By.xpath("//input[@id='answer6']");
  By slot8 = By.xpath("//input[@id='answer8']");
  By radio1 = By.xpath("//input[@value='wrotebook']");
  By slot10 = By.xpath("//input[@id='answer10']");
  By slot11 = By.xpath("//input[@id='answer11']");
  By visibleElement = By.cssSelector("div[id='ishere']");
  By slot13 = By.xpath("//input[@id='answer13']");
  By visibleBox = By.xpath("//div[@id='purplebox']");
  By slot14 = By.xpath("//input[@id='answer14']");
  By clickAndWait = By.xpath("//p/a");
  By clickAfterWait = By.xpath("//a[contains(text(),'click after wait')]");
  By submitBtn = By.xpath("//input[@id='submitbutton']");
  By checkResults = By.xpath("//input[@id='checkresults']");
  By passed = By.xpath("//div[@id='showresults']");
  By firstBox = By.xpath("//h3[4]/following::span[1]");



  public TasksPage(WebDriver driver) { this.driver=driver; }

  public WebElement insertTitle() { return driver.findElement(slot1); }

  public WebElement grabText() { return driver.findElement(textToTrim); }

  public WebElement insertName() { return driver.findElement(nameInput); }

  public WebElement clickSelect() { return driver.findElement(select);}

  public List<WebElement> numberBlueBoxes() { return driver.findElements(blueBoxes);}

  public WebElement insertCount() { return driver.findElement(slot4);}

  public WebElement clickMe() { return driver.findElement(link);}

  public WebElement redBoxClass() { return driver.findElement(redBox);}

  public WebElement insertClass() { return driver.findElement(slot6); }

  public WebElement insertJsFunction() { return driver.findElement(slot8);}

  public WebElement writtenBook() { return driver.findElement(radio1);}

  public WebElement insertRedBoxText() { return driver.findElement(slot10);}

  public WebElement insertColor() { return driver.findElement(slot11);}

  public List <WebElement> yesNoElement() { return driver.findElements(visibleElement);}

  public WebElement insertYesNo() { return driver.findElement(slot13);}

  public WebElement yesNoBox() { return driver.findElement(visibleBox);}

  public WebElement insertYesNo2() { return driver.findElement(slot14);}

  public WebElement clickOnSign() { return driver.findElement(clickAndWait);}

  public WebElement clickOnSign2() { return driver.findElement(clickAfterWait);}

  public WebElement clickSubmit() { return driver.findElement(submitBtn);}

  public WebElement clickCheckResults() { return driver.findElement(checkResults);}

  public WebElement getResults() { return driver.findElement(passed);}

  public WebElement correctColor() { return driver.findElement(firstBox);}
}
