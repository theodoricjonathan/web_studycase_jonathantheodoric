package demo.pages.backoffice;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ItemLibraryPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
  }

  public void clickCreateItem() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Item')]")).click();
  }

  public void inputNames(String data) {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//input[@placeholder='Item Name']")).sendKeys(data);
  }

  public void inputPrices(String data) {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//input[@placeholder='Price']")).sendKeys(data);
  }

  public void clickSaveItem() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
  }

  public String getItem() {
    WebElement titleArticle = WebDriverInstance.webDriver.findElement(By.xpath("//td[contains(text(),'Tea')]"));
    String data = titleArticle.getText();
    return data;
  }
}
