package sample.selenium;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AppTest {

//    @Test
//    public void maltiplicationで5と2の乗算結果が取得できる() throws Exception {
//    	assertThat(7).isBetween(0, 9);
//    }
//
//    @Test
//    public void maltiplicationで5と3の乗算結果が取得できる() throws Exception {
//    	App app = new App();
//    	app.someMethod(0, 0, 0, 0);
//    }
//
//	@Test
//	public void testQiita() throws InterruptedException {
//		// Optional. If not specified, WebDriver searches the PATH for chromedriver.
//		System.setProperty("webdriver.chrome.driver", "/Users/sho_shimizu/Downloads/soft/chromedriver");
//		WebDriver driver = new ChromeDriver();
//
//		driver.get("https://qiita.com/naotawool/items/6512ecbe2fd006dacfd2");
//
//		WebElement title = driver.findElement(By.className("it-Header_title"));
//		String actual = title.getText(); // AssertJ版：テストでよく使う検証メソッド一覧
//		String expected = "AssertJ版：テストでよく使う検証メソッド一覧";
//		assertThat(actual, is(expected));
//
//		driver.quit();
//	}
//
//	@Test
	public void testGoogleSearch() throws InterruptedException {
		// Optional. If not specified, WebDriver searches the PATH for chromedriver.
		System.setProperty("webdriver.chrome.driver", "/Users/sho_shimizu/Downloads/soft/chromedriver");

		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com/");
	    Thread.sleep(5000);  // Let the user actually see something!
	    WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("ChromeDriver");
		searchBox.submit();
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	public void sampleTest() {
		int a = 10;
		assertThat(a, is(10)); // if a == 10
	}

//	@Test
//	public void sampleTest2() {
//		int a = 10;
//		assertThat(a, is(greaterThan(5)));
//		assertThat(a, is(10));
//	}
//
//	@Test
//	public void sampleTest3() {
//		int a = 10;
//		assertThat(a, is(lessThan(15)));
//		assertThat(a, is(10));
//	}


	@Test
	public void sampleJenkinsTest() {
		int a = 10;
		assertThat(a, is(10));
	}

//    @Test
//    public void カバレッジテスト() {
//    	App app = new App();
//    	app.someMethod(0, 0, 1, 1);
//    	app.someMethod(1, 0, 0, 0);
////    	app.someMethod(0, 0, 1, 1);
////    	app.someMethod(1, 1, 0, 0);
////    	app.someMethod(0, 0, 0, 0);
////    	app.someMethod(0, 1, 1, 0);
////    	app.someMethod(1, 0, 1, 0);
////    	app.someMethod(1, 1, 1, 0);
//    }

//    @Test
//    public void テストは成功する() {
//    	int a = 10;
////    	String str = null;
////    	App app = new App();
//////    	app.someMethod(0, 0, 1, 1);
////    	app.someMethod(1, 1, 0, 0);
//////    	app.someMethod(0, 0, 0, 0);
//////    	app.someMethod(0, 1, 1, 0);
//////    	app.someMethod(1, 0, 1, 0);
//////    	app.someMethod(1, 1, 1, 0);
//////    	str.chars();
//////        assertThat(a, is(greaterThan(9)));
//////        assertThat(a, is(lessThan(11)));
//////        assertThat(a, is(10));
//        assertEquals(a, 10);
//    }

//    @Test
//    public void テストは失敗する() {
//        assertThat(10, is(greaterThan(10)));
//    }
}