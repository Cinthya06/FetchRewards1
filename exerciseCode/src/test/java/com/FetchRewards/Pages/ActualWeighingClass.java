package com.FetchRewards.Pages;

import com.FetchRewards.Utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ActualWeighingClass {

    private WebElement result;
    private WebElement inputRowLeft;
    private WebElement inputRowRight;
    private WebElement weighButton = Driver.get().findElement(By.xpath("//button[@id='weigh']"));
    private WebElement resetButton = Driver.get().findElement(By.xpath("//button[@id='weigh']/preceding::button[1][@id='reset']"));
    private WebElement fakeBar;


    public WebElement getResult(int resultNum) {
        return Driver.get().findElement(By.xpath("//ol/li[" + resultNum + "]"));
    }

    public WebElement setInputRowLeft() {
        return Driver.get().findElement(By.xpath("//input[@id='left_1']"));
    }

    public WebElement setInputRowRight(int row) {
        return Driver.get().findElement(By.xpath("//input[@id='right_" + row + "']"));
    }

    public WebElement setFakeBar(int number) {
        return Driver.get().findElement(By.xpath("//button[@id='coin_" + number + "']"));
    }

    public List<WebElement> getInputValues(int values) {
        return Driver.get().findElements(By
                .xpath("//ol/li[" + values + "]"));
    }


    public static String value;

    public int findFakeNumber() throws InterruptedException {
        int starter = 0;
        setInputRowLeft().sendKeys("" + starter);
        for (int i = 1; i <= 8; i++) {
            if (gettingInputValues(i).contains(">")) {
                setFakeBar(i).click();
            }

        }

        return starter;
    }

    public void clickingOnFakeNum() throws InterruptedException {
        Thread.sleep(3);

        for (int i = 0; i <= 8; i++) {
            if (getInputValues(i).contains(value.charAt(7))) {
                //   setFakeBar().getText();
                //}


//                    System.out.println(setFakeBar(i).getText());
//                    WebDriverWait wait = new WebDriverWait(Driver.get(), 40);
//                    wait.until(ExpectedConditions.alertIsPresent());
//                    String alert = Driver.get().switchTo().alert().getText();
//
//                  //  a = alert.equals("Yay! You find it!");
//                    Driver.get().switchTo().alert().accept();

            }
        }
    }



    public String gettingInputValues(int resultNums) throws InterruptedException {
        List<WebElement> liElements = Driver.get().findElements(By
                .xpath("//ol/li[" + resultNums + "]"));
        int i = 0;

        for (WebElement elements : liElements) {
            elements = liElements.get(i);
            // System.out.println(elements);
             value = elements.getText();

            Thread.sleep(300);
            if (value.contains(">"))
                System.out.println("number " + value.charAt(7) + " this is the fake Gold Bar");//printing each value
            //i = i+1;
            i++;
        }

        final String s = "0 is the fake Gold Bar";
        return s;
    }
    public void inputValues() throws InterruptedException {
        int starter = 0;
        for (int i = 1; i <= 8; i++) {
            setInputRowLeft().sendKeys("" + starter);
            setInputRowRight(i).sendKeys("" + i);
            weighButton.click();
            resetButton.click();
            String values = gettingInputValues(i);
        }
    }
}

//    public void findFakeBar() {
//    }

//    public void findFakeBar() throws InterruptedException {
//        Boolean a=false;
//        try {
//           // WebDriverWait wait = new WebDriverWait(Driver.get(), 40);
//            setFakeBar(findFakeNumber()).click();
//            WebDriverWait wait = new WebDriverWait(Driver.get(), 40);
//            wait.until(ExpectedConditions.alertIsPresent());
//            String alert = Driver.get().switchTo().alert().getText();
//
//            a = alert.equals("Yay! You find it!");
//            Driver.get().switchTo().alert().accept();
//
//        }
//        finally {
//            try {
//                Assert.assertTrue(a);
//            }catch(AssertionError e){
//                System.out.println("Expected success message, but got failed");
//              //  Assert.fail();
//            }
//        }

//   }



//}

