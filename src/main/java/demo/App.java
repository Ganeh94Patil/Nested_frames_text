/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package demo;
import java.net.MalformedURLException;

import javafx.scene.image.Image;


public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
        TestCases tests = new TestCases(); // Initialize your test class
       // AmazonSearch amazon = new AmazonSearch();
       // Count_hyperlinks hyperlinks = new Count_hyperlinks();
       // Post_on_linkedin linkedin  = new Post_on_linkedin();
       //   Image_urls Image = new Image_urls();
        // Nested_frames_text Nested = new Nested_frames_text();
        //  Imdb_Ratings Imdb = new Imdb_Ratings();
          Window_Handle Window = new Window_Handle();

        //TODO: call your test case functions one after other here

       // tests.testCase01();
      //  amazon.testCase01();
       // hyperlinks.testCase02();
       // linkedin.testCase03();
       //   Image.testCase04();
        //  Nested.testCase05();
       //  Imdb.testCase06();
         Window .testCase07();

        //END Tests


       // tests.endTest(); // End your test by clearning connections and closing browser
      //  amazon.endTest();
       // hyperlinks.endTest();
       // linkedin.endTest();
       // Image.endTest();
        // Nested.endTest();
        //  Imdb.endTest();
         Window.endTest();
    }

    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
    
}