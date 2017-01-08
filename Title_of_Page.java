package myProject;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class Title_of_Page {
 
    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://selenium.couponapitest.com/";
        String expectedTitle = "Index Page";
        String actualTitle = "";
 
        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);
 
        // get the actual value of the title
        actualTitle = driver.getTitle();
 
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Title Present ");
        } else {
            System.out.println("Title Not Present");
        }
        
        //close Firefox
        driver.close();
        
        // exit the program explicitly
        System.exit(0);
    }
 
}
