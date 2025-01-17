package com.ann.casestudyone;


import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class GoogleSearchPageTraditionalSeleniumTests extends BaseSeleniumTests {
        
    @Test
    public void getSearchPage() {
		this.driver.get("https://www.google.com");
        WebElement element = this.driver.findElement(By.name("q"));
        assertNotNull(element);
    }
	
	@Test
    public void getSearchTitle() {
		this.driver.get("https://www.google.com");
		System.out.println("this.driver.getTitle() "+ this.driver.getTitle());
        assertEquals("Google",this.driver.getTitle().toString());
    }


}