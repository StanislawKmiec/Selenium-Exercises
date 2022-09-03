import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.TasksPage;
import resources.BasicOperations;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class SeleniumPlayGround extends BasicOperations {

    @BeforeTest (groups = {"even", "odd"})
    public void start() throws Exception {
        driver = startDriver();
        driver.get(data.getProperty("url"));
    }

    @Test (groups = {"even"})
    public void firstTask() {
        TasksPage tp = new TasksPage(driver);
        String pageTitle =  driver.getTitle();
        tp.insertTitle().sendKeys(pageTitle);
    }

    @Test (groups = {"odd"})
    public void secondTask() throws InterruptedException {
        TasksPage tp = new TasksPage(driver);
        String uncuted = tp.grabText().getText();
        String[] arr = uncuted.split(" ");
        String name = arr[8];
        String surName= arr[9];
        String finalName = name + " " + surName;
        tp.insertName().sendKeys(finalName);
    }

    @Test (groups = {"even"})
    public void thirdTask() {
        TasksPage tp = new TasksPage(driver);
        tp.clickSelect().click();
        Select choose = new Select(tp.clickSelect());
        choose.selectByValue("scifiauthor");
    }

    @Test (groups = {"odd"})
    public void fourthTask() {
        TasksPage tp = new TasksPage(driver);
        int xpathCount = tp.numberBlueBoxes().size();
        String count = String.valueOf(xpathCount);
        tp.insertCount().sendKeys(count);
    }

    @Test (groups = {"even"})
    public void fifthTask() {
        TasksPage tp = new TasksPage(driver);
        tp.clickMe().click();
    }

    @Test (groups = {"odd"})
    public void sixthTask() {
        TasksPage tp = new TasksPage(driver);
        String className = tp.redBoxClass().getAttribute("class");
        tp.insertClass().sendKeys(className);
    }

    @Test (groups = {"even"})
    public void seventhTask() {
        //TasksPage tp = new TasksPage(driver);
        ((JavascriptExecutor)driver).executeScript("ran_this_js_function();");
    }

    @Test (groups = {"odd"})
    public void eighthTask() {
       TasksPage tp = new TasksPage(driver);
       JavascriptExecutor j = (JavascriptExecutor) driver;
       Object result = j.executeScript("returnn got_return_from_js_function();");
       String numb = String.valueOf(result);
       tp.insertJsFunction().sendKeys(numb);
    }

    @Test (groups = {"even"})
    public void ninthTask() {
        TasksPage tp = new TasksPage(driver);
        tp.writtenBook().click();
    }

    @Test (groups = {"odd"})
    public void tenthTask() {
        TasksPage tp = new TasksPage(driver);
        String redBoxText = tp.redBoxClass().getText();
        tp.insertRedBoxText().sendKeys(redBoxText);
    }

    @Test (groups = {"even"})
    public void eleventhTask() {
        TasksPage tp = new TasksPage(driver);
        JavascriptExecutor j = (JavascriptExecutor) driver;
        String wholeStyle= tp.correctColor().getAttribute("style");
        String[] arr  =  wholeStyle.split(" ");
        String color = arr[1];
        String[] arr2 =  color.split(";");
        String finalColor = arr2[0];
        tp.insertColor().sendKeys(finalColor);
    }

    @Test (groups = {"odd"})
    public void twelfthTask() {
        TasksPage tp = new TasksPage(driver);
        int width = 850;
        int height = 650;
        Dimension dimension = new Dimension(width, height);
        driver.manage().window().setSize(dimension);
    }

    @Test (groups = {"even"})
    public void thirteenthTask() {
        TasksPage tp = new TasksPage(driver);
        String yes = "yes";
        String no = "no";
        int count = tp.yesNoElement().size();
        if (count > 0) {
            tp.insertYesNo().sendKeys(yes);
        } else {
            tp.insertYesNo().sendKeys(no);
        }
    }
    @Test (groups = {"odd"})
    public void fourtheenthTask() {
        TasksPage tp = new TasksPage(driver);
        Boolean condition = tp.yesNoBox().isDisplayed();
        String yes = "yes";
        String no = "no";
        if (condition == true) {
            tp.insertYesNo2().sendKeys(yes);
        } else {
            tp.insertYesNo2().sendKeys(no);
        }
    }

    @Test (groups = {"even", "odd"})
    public void fifteenthTaskAndSixteenthTask()  {
        TasksPage tp = new TasksPage(driver);
        tp.clickOnSign().click();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(13L))
                .pollingEvery(Duration.ofMillis(250L))
                .ignoring(NoSuchElementException.class);
        tp.clickOnSign2().click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test (groups = {"even"})
    public void seventeenthTask() {
        TasksPage tp = new TasksPage(driver);
        tp.clickSubmit().click();
    }

    @AfterTest (groups = {"even", "odd"})
    public void pointsCheck() {
        TasksPage tp = new TasksPage(driver);
        tp.clickCheckResults().click();
        String results = tp.getResults().getText();
        System.out.println(results);
    }

   @AfterSuite (groups = {"even", "odd"})
    public void exitBrowser1() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.close();
    }
}
