import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class multipleWindowHandelledPlaywright {

    public static void main(String[] args) {
        try (Playwright playwright = Playswright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

            Page parentPage = browser.newPage();
            parentPage.navigate("https://www.google.com/");

            // Click a link that opens a new window/tab and wait for the popup
            Page childPage = parentPage.waitForPopup(() -> {
                parentPage.locator("a[href='https://www.google.com/intl/en/about/products']").click();
            });

            childPage.waitForLoadState();

            // Interact with the child page
            childPage.locator("a[href='https://www.google.com/intl/en/about/products']").click();

            // Bring parent back to front
            parentPage.bringToFront();

            System.out.println("Hello World");

            // Close browser explicitly (Playwright will be closed by try-with-resources)
            browser.close();
        }
    }

}
