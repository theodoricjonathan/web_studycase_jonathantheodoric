package demo.pages.backoffice;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ModifiersPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void clickCreateModifier() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]")).click();
  }

  public void inputModifier(String data) {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//div[@class='form-group']//div//input[@placeholder='Name']")).sendKeys(data);
  }

  public void clickManage() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
  }

  public void clickAddOption() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]")).click();
  }

  public void inputName(String data) {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//div[@class='form-group col-sm-6']//input[@placeholder='Name']")).sendKeys(data);
  }

  public void inputPrice(String data) {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//div[@class='form-group col-sm-5']//input[@placeholder='Rp. 0']")).sendKeys(data);
  }

  public void clickSaveManage() {
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary'][contains(text(),'Save')]")).click();
  }

  public void clickSaves() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
  }

  public String getModifier(){
    WebElement titleArticle = WebDriverInstance.webDriver.findElement(By.xpath("//td[contains(text(),'Topping')]"));
    String data = titleArticle.getText();
    return data;
  }
}
