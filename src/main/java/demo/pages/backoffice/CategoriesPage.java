package demo.pages.backoffice;

import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesPage {

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
  }

  public void clickCreateCategory() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]")).click();
  }

  public void inputCategory(String data) {
    WebDriverInstance.webDriver
            .findElement(By.xpath("//input[@placeholder='Category Name']")).sendKeys(data);
  }

  public void clickSave() {
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
  }

  public String getCategory(){
    WebElement titleArticle = WebDriverInstance.webDriver.findElement(By.xpath("//td[contains(text(),'Makanan')]"));
    String data = titleArticle.getText();
    return data;
  }
}
