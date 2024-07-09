package com.ums.functions;

import java.util.Set;
import org.openqa.selenium.WebDriver;

public class WebActions {
    private WebDriver driver;
    private String mainWindowHandle;

    public WebActions(WebDriver driver) {
        this.driver = driver;
    }

    // Method to switch to another tab
    public void switchToAnotherTab() {
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(mainWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }
    
    public void swichToParentTab() {
    	 driver.switchTo().window(mainWindowHandle);
    }
    public void closeCurrentTab() {
        // Close the current tab
        driver.close();
        // Switch back to the parent tab
        swichToParentTab();
    }
    
    
    
}

