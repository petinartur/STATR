package ru.stqa.pft.statr.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by artur.petin on 27.09.2016.
 */
public class ApplicationManager {
    /*
      // Firefox Driver

      FirefoxDriver wd;
      GenerateData genData;

      public static boolean isAlertPresent(FirefoxDriver wd) {
          try {
              wd.switchTo().alert();
              return true;
          } catch (NoAlertPresentException e) {
              return false;
          }
      }

      public void init() {
          wd = new FirefoxDriver();
          genData=new GenerateData();
          wd.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
          wd.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
          wd.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
          wd.get("http://192.168.50.45");
          login("selenium", "selenium");

      }
    */
      //  CHROME DRIVER

       ChromeDriver wd;
       GenerateData genData;

          public static boolean isAlertPresent(ChromeDriver wd) {
              try {
                  wd.switchTo().alert();
                  return true;
              } catch (NoAlertPresentException e) {
                  return false;
              }
          }

          public void init() throws InterruptedException {
/*              System.setProperty("webdriver.chrome.driver", "/Users/artur/Desktop/buildAgent/chromedriver");
              ChromeOptions options = new ChromeOptions();
              options.addArguments("start-fullscreen");
//              options.addArguments("start-maximized");
              wd = new ChromeDriver(options);
              genData=new GenerateData();
              //     wd = new ChromeDriver();
*/

                ChromeOptions options = new ChromeOptions();
                 options.addArguments("start-maximized");
                wd = new ChromeDriver(options);
                 genData=new GenerateData();
         //     wd = new ChromeDriver();

              wd.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
              wd.manage().timeouts().setScriptTimeout(5000, TimeUnit.SECONDS);
              wd.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

                  wd.get("http://192.168.50.45");
         //     Thread.sleep(10000);
        //      login("admin", "master");
              wd.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
              wd.manage().timeouts().setScriptTimeout(5000, TimeUnit.SECONDS);
              wd.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);


                     login("admin", "master");

          }

    private void login(String username, String password) {
        wd.findElement(By.id("login-username")).click();
        wd.findElement(By.id("login-username")).clear();
        wd.findElement(By.id("login-username")).sendKeys(username);
        wd.findElement(By.id("login-password")).click();
        wd.findElement(By.id("login-password")).clear();
        wd.findElement(By.id("login-password")).sendKeys(password);
        wd.findElement(By.id("btn-login")).click();
    }
    public void goToLogs() {
        wd.findElement(By.cssSelector("li.ng-scope:nth-child(6) > a:nth-child(1)")).click();
    }
    public void goToFormGroup() {
        wd.findElement(By.cssSelector("li.ng-scope:nth-child(8) > a:nth-child(1)")).click();
    }
    public void goToSourceGroup() {
        wd.findElement(By.cssSelector("li.ng-scope:nth-child(7) > a:nth-child(1)")).click();
    }
    public void vereficryCurrentSituatuin(){

        assertTrue(wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div/h3")).getText().contains("Новости"));
    }
    public void goToDictionaryKOPUK() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(6) > a:nth-child(1)")).click();
    }
    public void goToDictionary() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();
    }
    public void goToStatus() {
        wd.findElement(By.linkText("Статусы")).click();
    }
    public void goToReference() {
        wd.findElement(By.linkText("Справочники")).click();
    }
    public void goToUsersGroup() {
        wd.findElement(By.linkText("Группы пользователей")).click();
    }
    public void goToUsers() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();
    }
    public void goToStatistics() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();
    }
    public void goToCurrentSituation() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
    }
    public void goToFormPage() {
        wd.findElement(By.linkText("Формы")).click();    }
    public void goToReportGenerator() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(2) > a:nth-child(1)")).click();
    }
    public void goToKonstkuktorZaprosovPage() {
        wd.findElement(By.cssSelector("div.accordion:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1)")).click();
    }
    public void goToGenDocument() {
        wd.findElement(By.linkText("Генератор документов")).click();
    }
    public void ZapolnenieKonstuktorZaprosov() {
        if (!wd.findElement(By.xpath("//div[@class='params-wrapper']//select[.='2010201120122013201420152016']//option[7]")).isSelected()) {
            wd.findElement(By.xpath("//div[@class='params-wrapper']//select[.='2010201120122013201420152016']//option[7]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_form_direction']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_form_direction']//option[3]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_form_name']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_form_name']//option[2]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_part_name']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_part_name']//option[2]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_graph_name']//option[3]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_graph_name']//option[3]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='filter_row_name']//option[2]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='filter_row_name']//option[2]")).click();
        }
        wd.findElement(By.cssSelector("button.btn:nth-child(2)")).click();
    }
    public void chistca() {
        wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[3]/div/button[2]")).click();
    }
    public void  zapolnenie() {
        if (!wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).isSelected()) {
            wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[1]/group-filter-year-period/div[1]/div/select//option[8]")).click();
        }
        if (!wd.findElement(By.xpath("//select[@id='statForm']//option[39]")).isSelected()) {
            wd.findElement(By.xpath("//select[@id='statForm']//option[39]")).click();
        }
        wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[3]/div/button[1]")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[3]/div")).click();
        wd.findElement(By.xpath("//div[3]/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")).click();
        wd.findElement(By.xpath("//div[2]/div/h4/a/span/div")).click();
        // Дописать измениние
        wd.findElement(By.xpath("//div[@class='modal-footer']//button[.='Сохранить и Проверить']")).click();
        wd.findElement(By.xpath("//div[@class='modal-header']/div[1]/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
        wd.findElement(By.xpath("//div[1]/div/div/div[3]/button[2]")).click();
    }
    public void proverka061() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:37']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:37']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka060() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:35']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:35']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.xpath("//*[@id=\"StatEditor\"]/div[2]/div[2]/div[1]/button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.modal-header > div.row.modal-body > div:nth-child(1) > button.btn.btn-warning")).click();


    }
    public void proverka062() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:128']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:128']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka064() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:133']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:133']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka070() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:39']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:39']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka071() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:41']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:41']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka074() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:132']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:132']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka1001() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:136']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:136']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka242() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:99']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:99']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka243() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:101']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:101']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka244() {
        if (!wd.findElement(By.cssSelector("option[value='number:2017']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2017']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:123']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:123']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
   //     wd.findElement(By.xpath("//div[2]/div/button")).click();
    //    wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/div[2]/div/button[2]")).click();


    }
    public void proverka2441() {
        wd.findElement(By.xpath("//*[@id=\"StatEditor\"]/div[2]/div[2]/div[2]/button[2]")).click();
        assertTrue(wd.findElement(By.xpath("//*[@id=\"StatEditor\"]/div[3]/div/div[1]/div/uib-accordion[1]/div/div")).getText().contains("Раздел 1"));

        wd.findElement(By.xpath("//*[@id=\"StatEditor\"]/div[2]/div[2]/div[1]/button[2]")).click();

        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();
    }
    public void proverka245() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:103']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:103']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka246() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:105']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:105']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka247() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:107']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:107']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka251() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:111']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:111']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka252() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:112']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:112']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka260() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:130']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:130']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void proverka280() {
        if (!wd.findElement(By.cssSelector("option[value='number:2016']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:2016']")).click();
        }
        //
        if (!wd.findElement(By.cssSelector("option[value='number:131']")).isSelected()) {
            wd.findElement(By.cssSelector("option[value='number:131']")).click();
        }
        wd.findElement(By.xpath("//div[@class='buttons-row']//button[normalize-space(.)='Поиск']")).click();
        wd.findElement(By.xpath("//div[2]/div/div/div/div/div[4]/div")).click();
        wd.findElement(By.xpath("//div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#StatEditor > div.close-modal > button")).click();
        wd.findElement(By.xpath("//div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("button.btn.btn-warning")).click();

    }
    public void createusers() {


 //       wd.findElement(By.xpath("//*[@id=\"1491819719984-0-uiGrid-0006-cell\"]/div")).click();
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button")).click();
        wd.findElement(By.xpath("//*[@id=\"login\"]/input")).sendKeys(Integer.toString(new Random().nextInt()));
        wd.findElement(By.cssSelector("#name > input")).sendKeys("autotest");
  // RANDOM NAME     wd.findElement(By.cssSelector("#name > input")).sendKeys(genData.generateRandomString(20));
        wd.findElement(By.cssSelector("#email > input")).sendKeys(genData.generateEmail(30));
        wd.findElement(By.cssSelector("#phone > input")).sendKeys(genData.generateRandomNumber(12));
        wd.findElement(By.cssSelector("#password > input")).sendKeys("passwrod1231231231231");
        wd.findElement(By.cssSelector("#position > input")).sendKeys("password1231123123123");
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();

    }
    public void poiskuser() {
        wd.findElement(By.cssSelector("#q > input")).sendKeys("autotest");
        wd.findElement(By.cssSelector("#main_list > div:nth-child(1) > div > div.col-md-12.col-xs-12.ng-scope > div > button:nth-child(1)")).click();
    }

    public void editusers() {


        wd.findElement(By.xpath("//div[.='autotest']")).click();


        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[3]")).click();
//        wd.findElement(By.xpath("//*[@id=\"login\"]/input")).sendKeys(Integer.toString(new Random().nextInt()));
        // RANDOM NAME     wd.findElement(By.cssSelector("#name > input")).sendKeys(genData.generateRandomString(20));
        wd.findElement(By.cssSelector("#email > input")).clear();
        wd.findElement(By.cssSelector("#email > input")).sendKeys(genData.generateEmail(30));
        wd.findElement(By.cssSelector("#phone > input")).clear();
        wd.findElement(By.cssSelector("#phone > input")).sendKeys("8(495)" + genData.generateRandomNumber(8));
        wd.findElement(By.cssSelector("#position > input")).clear();
        wd.findElement(By.cssSelector("#position > input")).sendKeys("password234234");
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();

    }
    public void deleteusers() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[4]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void createstatus() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button")).click();
        wd.findElement(By.cssSelector("#aname > input")).sendKeys("test1");
        wd.findElement(By.cssSelector("#color > div > input")).sendKeys(genData.generateRandomNumber(6));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();

    }
    public void editstatus() {
        wd.findElement(By.xpath("//div[.='test1']")).click();
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[2]")).click();
        wd.findElement(By.cssSelector("#color > div > input")).clear();
        wd.findElement(By.cssSelector("#color > div > input")).sendKeys(genData.generateRandomNumber(6));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();

    }
    public void deletestatus() {
        wd.findElement(By.xpath("//div[.='test1']")).click();
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[3]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void createReference() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button")).click();
        wd.findElement(By.xpath("//*[@id=\"aname\"]/input")).sendKeys("test");
        wd.findElement(By.xpath("//*[@id=\"dictcat_CODE\"]/input")).sendKeys(genData.generateRandomString(5));
        wd.findElement(By.xpath("//*[@id=\"adesc\"]/textarea")).sendKeys(genData.generateRandomString(10));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void editReference() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[2]")).click();
        wd.findElement(By.xpath("//*[@id=\"dictcat_CODE\"]/input")).sendKeys(genData.generateRandomString(5));
        wd.findElement(By.xpath("//*[@id=\"adesc\"]/textarea")).sendKeys(genData.generateRandomString(10));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void deleteReference() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[3]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void backToReference() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[1]")).click();
    }
    public void goToZnachReference() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[6]/li[9]/a")).click();
        wd.findElement(By.xpath("//div[.='test']")).click();
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[4]")).click();
    }
    public void createZnachReference() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[2]")).click();
        wd.findElement(By.xpath("//*[@id=\"dictval_CODE\"]/input")).sendKeys(genData.generateRandomString(8));
        wd.findElement(By.xpath("//*[@id=\"aname\"]/input")).sendKeys("test");
        wd.findElement(By.xpath("//*[@id=\"adesc\"]/input")).sendKeys(genData.generateRandomString(10));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void editZnachReference() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[3]")).click();
        wd.findElement(By.xpath("//*[@id=\"dictval_CODE\"]/input")).sendKeys(genData.generateRandomString(8));
        wd.findElement(By.xpath("//*[@id=\"adesc\"]/input")).sendKeys(genData.generateRandomString(10));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();

    }
    public void deleteZnachReference() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[4]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void createUsersGroup() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button")).click();
        wd.findElement(By.xpath("//*[@id=\"groupname\"]/input")).sendKeys("test");
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();

    }
    public void editUserGroup() {
        wd.findElement(By.xpath("//div[.='test']")).click();
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[2]")).click();
        wd.findElement(By.xpath("//*[@id=\"groupname\"]/input")).sendKeys(genData.generateRandomString(10));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void deleteUserGroup() {
        wd.findElement(By.xpath("//div[.='test']")).click();
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[3]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void createForm() {
        wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div[1]/div/button[1]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div/div/li[1]/input")).sendKeys("autotest");
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div/div/li[2]/input")).sendKeys(genData.generateRandomString(5));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div/div/li[3]/input")).sendKeys(genData.generateRandomString(5));
        wd.findElement(By.xpath("//*[@id=\"fromdt\"]/div/span/button/i")).click();
        wd.findElement(By.xpath("//*[@id=\"fromdt\"]/div/div/ul/li[2]/span/button[1]")).click();
        wd.findElement(By.xpath("//*[@id=\"todt\"]/div/span/button")).click();
        wd.findElement(By.xpath("//*[@id=\"dates\"]/div/input")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/button[2]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/button")).click();

    }
    public void editForm() {
        wd.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("autotest");
        wd.findElement(By.xpath("//div[.='autotest']")).click();
        wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div[1]/div/button[2]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div/div/li[2]/input")).sendKeys(genData.generateRandomString(5));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[1]/div/div/li[3]/input")).sendKeys(genData.generateRandomString(5));
        wd.findElement(By.xpath("//*[@id=\"fromdt\"]/div/span/button/i")).click();
        wd.findElement(By.xpath("//*[@id=\"fromdt\"]/div/div/ul/li[2]/span/button[1]")).click();
        wd.findElement(By.xpath("//*[@id=\"todt\"]/div/span/button")).click();
//        wd.findElement(By.xpath("//*[@id=\"dates\"]/div/input")).click();
//        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/button[2]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/button")).click();

    }
    public void deleteForm() {
//        wd.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("autotest");
//        wd.findElement(By.xpath("//div[.='autotest']")).click();

        wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div/div[1]/div/button[3]/i")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void createGenDocument() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[1]")).click();
        wd.findElement(By.xpath("//*[@id=\"aname\"]/input")).sendKeys("autotest");
        wd.findElement(By.xpath("//*[@id=\"type\"]/select")).click();
        wd.findElement(By.cssSelector("option[value='number:1']")).click();
        wd.findElement(By.xpath("//*[@id=\"anoperator\"]/textarea")).sendKeys(genData.generateRandomString(10));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void editGenDocument(){
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[6]/li[11]/a")).click();
        wd.findElement(By.xpath("//div[.='autotest']")).click();
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[2]")).click();
        wd.findElement(By.xpath("//*[@id=\"anoperator\"]/textarea")).clear();
        wd.findElement(By.xpath("//*[@id=\"anoperator\"]/textarea")).sendKeys(genData.generateRandomString(10));
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void deleteGenDocument() {
        wd.findElement(By.xpath("//*[@id=\"main_list\"]/div[2]/div/button[3]")).click();
        wd.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/button[2]")).click();
    }
    public void filtrsStatistic() {
        wd.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div/div[1]/group-filter-stat-data/div[3]/div/button[1]")).click();
        wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[2]/div[2]/div[2]/div/div/input")).sendKeys("(064) Форма");
        wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[3]/div[2]/div[2]/div/div/input")).sendKeys("Калин");
        wd.findElement(By.xpath("//div[@class='ui-grid-contents-wrapper']/div[2]/div[1]/div/div/div/div/div/div[5]/div[2]/div[2]/div/div/input")).sendKeys("Тестовое");
    }
    public void goToGenReports() {
        wd.findElement(By.linkText("Генератор отчетов")).click();

    }
    public void genReports() {
  //      String windowHandler = wd.getWindowHandle();
        wd.switchTo().window((String) wd.getWindowHandles().toArray()[1]);
        wd.findElement(By.id("name")).clear();
        wd.findElement(By.id("name")).sendKeys("011-1");
        wd.findElement(By.cssSelector("div.btn-toolbar > div.btn-group > button.btn.btn-default")).click();
        wd.findElement(By.cssSelector("#example > tbody > tr > td:nth-child(7) > button > span")).click();
        wd.switchTo().window((String) wd.getWindowHandles().toArray()[2]);
        wd.findElement(By.cssSelector("body > div.form-horizontal > div.form-group.note > div > textarea")).sendKeys("autotest");
        wd.findElement(By.cssSelector("body > div.form-horizontal > div:nth-child(7) > div > button")).click();
    }
    public void stopGenReports() {
        wd.findElement(By.xpath("")).click();
    }
    public void deleteGenReports() {
        wd.findElement(By.xpath("//*[@id=\"example\"]/tbody/tr[1]/td[10]/button")).click();
    }
  public void stop() {

        wd.quit();
    }
}