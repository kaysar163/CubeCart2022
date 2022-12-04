package com.unitedcoder.Cubecartapplicationhomework;

import com.unitedcoder.exceldemo.ExcelUtility;
import com.unitedcoder.io.FileUtility;
import com.unitedcoder.io.FileWriteDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductReview extends  BaseClassForProject{
    public static void AddReview(){
        ExcelUtility excelUtility=new ExcelUtility();
        List<ReviewInfo>ReviewList;
        ReviewInfo r1=new ReviewInfo();
        ReviewInfo r2=new ReviewInfo();
        ReviewInfo r3=new ReviewInfo();
     ReviewList=new ArrayList<>(Arrays.asList(r1,r2,r3));
     for (int i=1; i<=ReviewList.size();i++){
         ReviewList.get(i-1).setProduct(excelUtility.readFromExcelCell(excelFileName,
                 "Review",i,0));
         ReviewList.get(i-1).setName(excelUtility.readFromExcelCell(excelFileName,
                 "Review",i,1));
         ReviewList.get(i-1).setEmail(excelUtility.readFromExcelCell(excelFileName,
                 "Review",i,2));
         ReviewList.get(i-1).setTile(excelUtility.readFromExcelCell(excelFileName,
                 "Review",i,3));
         ReviewList.get(i-1).setContent(excelUtility.readFromExcelCell(excelFileName,
                 "Review",i,4));
     }
     for(int i=1; i<=ReviewList.size();i++){
         WebElement reviews=driver.findElement(By.xpath("//a[text()=\"Reviews\"]"));
         reviews.click();
         WebElement addReviews=driver.findElement(By.xpath("//a[text()=\"Add review\"]"));
         addReviews.click();
         WebElement reviewProductName=driver.findElement(By.id("ajax_name"));
         reviewProductName.sendKeys(ReviewList.get(i-1).getProduct());
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
         WebElement Status=driver.findElement(By.cssSelector("checkbox cbs"));
         Status.click();
         WebElement reviewName=driver.findElement(By.id("review_name"));
         reviewName.sendKeys(ReviewList.get(i-1).getName());

         WebElement reviewEmail=driver.findElement(By.id("review_email"));
         reviewEmail.sendKeys(ReviewList.get(i-1).getEmail());

         WebElement reviewTile=driver.findElement(By.id("review_title"));
         reviewTile.sendKeys(ReviewList.get(i-1).getTile());
         WebElement reviewContent=driver.findElement(By.id("review_content"));
        reviewContent.sendKeys(ReviewList.get(i-1).getTile());
        WebElement reviewStar=driver.findElement(By.xpath("//*[text()=\"5\"]"));
        reviewStar.click();
        WebElement reviewSubmitButton=driver.findElement(By.xpath("input[class=\"submit\"]"));
       reviewSubmitButton.click();

       WebElement ReviewSuccessfullyAddedMessage=driver.findElement(By.xpath("//*[text()=\"Review successfully added.\"]"));
       if(ReviewSuccessfullyAddedMessage.isDisplayed()){
           System.out.println("Review add successfully");
       }else {
           System.out.println("add review fialed");
       }
     }
    }
       public static  void UpdateReview() throws InterruptedException, IOException {
           ExcelUtility excelUtility=new ExcelUtility();
        for(int i=1; i<=3;i++){
             WebElement reviews=driver.findElement(By.xpath("//a[text()=\"Reviews\"]"));
             reviews.click();
             driver.findElement(By.xpath("//a[text()=\"Search\"]")).click();

            driver.findElement(By.id("search-products")).sendKeys(excelUtility.readFromExcelCell(excelFileName,
                     "Review",i,0));
            Thread.sleep(2000);
            WebElement filterProductBropDown=driver.findElement(By.xpath("(//span[@class='jqac-link'])[1]"));
            filterProductBropDown.click();

            driver.findElement(By.xpath("//input[@class\"submit\"]")).click();

            WebElement productReviewEdit=driver.findElement(By.cssSelector(".fa.fa-pencil-square-o"));
            productReviewEdit.click();

            WebElement reviewThreeStar=driver.findElement(By.xpath("//a[text()=\"3\"]"));
            reviewThreeStar.click();

            WebElement reviewEditSybmit=driver.findElement(By.cssSelector("input[class=\"submit\"]"));
            WebElement successReviewMessage=driver.findElement(By.xpath("//*[text()=\"Review successfully updated.\"]"));
            String testResult="";
            if(successReviewMessage.isDisplayed()) {
                testResult = "Review updated successfully";
            }else {
                testResult="update review failed";
            }
            FileUtility fileUtility=new FileUtility();
            fileUtility.writeToFile("doc","review update result"+ FileWriteDemo.getCurrentDateTime(),
                    ".txt",testResult);


     }
    }
    public  static  void DeleteReview() throws InterruptedException, IOException {
        ExcelUtility excelUtility=new ExcelUtility();
        for(int i=1; i<=3;i++){
            WebElement reviews=driver.findElement(By.xpath("//a[text()=\"Reviews\"]"));
            reviews.click();

            driver.findElement(By.xpath("//a[text()=\"Search\"]")).click();
            driver.findElement(By.id("search-products")).sendKeys(excelUtility.readFromExcelCell
                    (excelFileName,"Review",i,0));
            Thread.sleep(2000);
            WebElement  filterProductDropdown=driver.findElement(By.xpath("(//span[@calss='jqac-link'])[1]"));
            filterProductDropdown.click();
            driver.findElement(By.xpath("//input[@class=\"submit\"]")).click();
            driver.findElement(By.className("customer-checkbox")).click();//product reviiew check box
            driver.findElement(By.className(".tiny.submit_confirm")).click();//delete go
            driver.switchTo().alert().accept();
            WebElement successReviewMessage=driver.findElement(By.xpath("//*[text()=\"Review successfully deleted.\"]"));
            String testResult="";
            if(successReviewMessage.isDisplayed()){
                testResult="review deleted successfully";

            }else {
                testResult="delete Review failed";

            }
            FileUtility fileUtility=new FileUtility();
            fileUtility.writeToFile("doc","delate review result-"+FileWriteDemo.getCurrentDateTime(),
                    ".text",testResult);
        }
    }

}
