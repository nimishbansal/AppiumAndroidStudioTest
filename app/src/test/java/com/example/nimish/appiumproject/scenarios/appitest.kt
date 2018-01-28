package com.example.nimish.appiumproject.scenarios

import android.widget.Button
import java.net.MalformedURLException
import java.net.URL
import java.util.concurrent.TimeUnit

import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait


class appitest
{

    lateinit var driver: WebDriver

    @Before
    @Throws(MalformedURLException::class)
    fun setUp()
    {
        // Created object of DesiredCapabilities class.
        val capabilities = DesiredCapabilities()

        capabilities.setCapability("deviceName", "micromax-micromax_e313-192.168.0.102:5555")
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android")
        capabilities.setCapability(CapabilityType.VERSION, "5.1")
        capabilities.setCapability("platformName", "Android")
        capabilities.setCapability("appPackage","com.example.nimish.appiumproject")
        capabilities.setCapability("appActivity","com.example.nimish.appiumproject.MainActivity")

        driver = RemoteWebDriver(URL("http://127.0.0.1:4723/wd/hub"), capabilities)
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS)


    }

    @Test
    fun testFirstCalculator()
    {
        var element:WebElement?=null
        for (i in 1..20)
        {
            element = driver.findElement(By.id("button"))
            element.click()
        }
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)
    }

    @After
    fun End()
    {
        driver.quit()
    }
}



