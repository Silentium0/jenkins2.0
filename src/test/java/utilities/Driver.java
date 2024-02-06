package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.time.Duration;

public class Driver {

    private Driver() {
        }

    /*
    making driver instance private
    static - run before everything else and also use in static method
     */

        private static WebDriver driver;

    /*
    reusable method that will return the same driver instance every time called
     */

        /**
         * singleton pattern
         *
         * @return driver
         */
        public static WebDriver getDriver() {
            if (driver == null) {
                String browserType = ConfigurationReader.getProperty("browser");
                switch (browserType.toLowerCase()) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        break;
                    case "remote-chrome-linux":
                        try {
                            // assign your grid server address
                            String gridAddress = "54.236.125.163";
                            URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                            ChromeOptions chromeOptions = new ChromeOptions();
                            chromeOptions.addArguments("--headless");
                            chromeOptions.addArguments("--no-sandbox");
                            chromeOptions.addArguments("--disable-dev-shm-usage");
                            desiredCapabilities.merge(chromeOptions);
                            driver = new RemoteWebDriver(url, desiredCapabilities);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                }
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }
            return driver;
        }

        /**
         * closing driver
         *
         *
         */
        public static void closeDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }

