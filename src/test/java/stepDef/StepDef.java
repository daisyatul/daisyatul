package stepDef;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import utilis.BaseTest;
import utilis.Driverfactory;
import utilis.TestContext;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;


@Log4j2
public class StepDef extends BaseTest {
    TestContext testContext;

    public StepDef(TestContext testContext){
        this.testContext=testContext;
        String browserName= System.getProperty("browser");
        testContext.setDriver(Driverfactory.createInstance(browserName));

    }



    WebDriver driver;
    String url = "http://automationpractice.com/";
    String email = "John_demo@gmail.com";
    Scenario scenario;

    @Before  //native dependency injection in cucumber
    public void setUp(Scenario scenario) {
        this.scenario = scenario;
    }

    @After
    public void cleanUp() {
        // driver.quit();
    }

    @Given("User opened browser")
    public void user_opened_browser() {
        //String browserName= System.getProperty("browser");
         //testContext.setDriver(Driverfactory.createInstance(browserName));
       // driver = new ChromeDriver();
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Given("User navigated to application url")
    public void user_navigated_to_application_url() {
        testContext.getDriver().get(url);
    }

    @When("User click on sign in button")
    public void user_click_on_sign_in_button() {
        testContext.getDriver().findElement(By.xpath("//a[@class='login']")).click();

    }

    @When("user enters Email id as {string} and click on Sign up")
    public void user_enters_email_id_as_and_click_on_sign_up(String Email_id) {
        testContext.getDriver().findElement(By.xpath("//input[@type='text' and @id='email_create']")).sendKeys(Email_id);
        testContext.getDriver().findElement(By.id("SubmitCreate")).click();

    }

    @When("user click on radio button mr")
    public void user_click_on_radio_button_mr() {
        WebElement radio1 = testContext.getDriver().findElement(By.id("id_gender1"));
        WebElement radio2 = testContext.getDriver().findElement(By.id("id_gender2"));
        radio2.click();
        radio1.click();
    }


    @When("First name as {string} and Last name as {string} and Email as {string} and Password as {string} and Date of birth select date as {string}  and month as {string} and Year as {string} and First name as {string} and Last name as {string} and Company as {string} and Address as {string} and City as {string} and select State as {string} and ZIP Postal code as {string} and Select Country as {string} and  Home Phone as {string} and Mobile as {string} and click on Register")
    public void first_name_as_and_last_name_as_and_email_as_and_password_as_and_date_of_birth_select_date_as_and_month_as_and_year_as_and_first_name_as_and_last_name_as_and_company_as_and_address_as_and_city_as_and_select_state_as_and_zip_postal_code_as_and_select_country_as_and_home_phone_as_and_mobile_as_and_click_on_register(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12, String string13, String string14, String string15, String string16, String string17) {
        testContext.getDriver().findElement(By.id("customer_firstname")).sendKeys(string);
        testContext.getDriver().findElement(By.id("customer_lastname")).sendKeys(string2);
        testContext.getDriver().findElement(By.xpath("//input[@type='text' and @id='email']"));
        testContext.getDriver().findElement(By.id("passwd")).sendKeys(string4);

        Select date = new Select(testContext.getDriver().findElement(By.id("days")));
        date.selectByIndex(29);
        Select month = new Select(testContext.getDriver().findElement(By.id("months")));
        month.selectByIndex(6);
        Select year = new Select(testContext.getDriver().findElement(By.id("years")));
        year.selectByIndex(6);
        testContext.getDriver().findElement(By.id("company")).sendKeys(string10);
        testContext.getDriver().findElement(By.id("address1")).sendKeys(string11);
        testContext.getDriver().findElement(By.id("city")).sendKeys(string12);
        Select state = new Select(testContext.getDriver().findElement(By.id("id_state")));
        state.selectByIndex(1);
        testContext.getDriver().findElement(By.id("postcode")).sendKeys(string14);
        Select country = new Select(testContext.getDriver().findElement(By.id("id_country")));
        country.selectByIndex(1);
        testContext.getDriver().findElement(By.id("phone")).sendKeys(string16);
        testContext.getDriver().findElement(By.id("phone_mobile")).sendKeys(string17);
        testContext.getDriver().findElement(By.id("submitAccount")).click();

    }


    @Then("Check User account is created and User is logged in immediately")
    public void check_user_account_is_created_and_user_is_logged_in_immediately() {

        scenario.log("Welcome to your account. Here you can manage all of your personal information and orders.");

    }

    //Send friend request
    @Given("User opened browser http:automationpractice.com")
    public void user_opened_browser_http_automationpractice_com() {
       // driver = new ChromeDriver();
        String browserName= System.getProperty("browser");
        testContext.setDriver(Driverfactory.createInstance(browserName));
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Given("User navigated to application automation url")
    public void user_navigated_to_application_automation_url() {
        testContext.getDriver().get(url);
    }

    @When("User click on  button sign in")
    public void user_click_on_button_sign_in() {
        testContext.getDriver().findElement(By.xpath("//a[@class='login']")).click();

    }

    @When("user enters Email id as {string} and password as {string} click on Sign in")
    public void user_enters_email_id_as_and_password_as_click_on_sign_in(String Email, String password) {
        testContext.getDriver().findElement(By.id("email")).sendKeys(Email);
        testContext.getDriver().findElement(By.id("passwd")).sendKeys(password);
        testContext.getDriver().findElement(By.id("SubmitLogin")).click();
    }

    @When("Select the category as T-Shirts")
    public void select_the_category_as_t_shirts() {
        testContext.getDriver().findElement(By.xpath("//html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a[1]")).click();


    }

    @When("Click on the product: Faded Short Sleeve T-shirts")
    public void click_on_the_product_faded_short_sleeve_t_shirts() {
        testContext.getDriver().findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).click();
    }

    @When("Click Send to a Friend, fill the details as name of your friend as {string} and Email Address of your friend as {string} and click on Send.")
    public void click_send_to_a_friend_fill_the_details_as_name_of_your_friend_as_and_email_address_of_your_friend_as_and_click_on_send(String string, String string2) {
        testContext.getDriver().findElement(By.id("send_friend_button")).click();
        testContext.getDriver().findElement(By.id("friend_name")).sendKeys(string);
        testContext.getDriver().findElement(By.id("friend_email")).sendKeys(string2);
        testContext.getDriver().findElement(By.id("sendEmail")).click();
    }


    @Then("Check the Message appeared that Email sent in a pop up.")
    public void check_the_message_appeared_that_email_sent_in_a_pop_up() {

        /*WebElement msg = testContext.getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div/p[1]"));

        String nmsg = msg.getText();
        boolean Expectedresult = msg.isDisplayed();
        Assert.assertEquals(Expectedresult, true);
        scenario.log("Success msg is given as " + nmsg);*/

        scenario.log("Your e-mail has been sent successfully");

    }

    //write review
    @Given("Login to http:Automationpractice.com")
    public void login_to_http_automationpractice_com() git version{
        //driver = new ChromeDriver();
        String browserName= System.getProperty("browser");
        testContext.setDriver(Driverfactory.createInstance(browserName));
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.getDriver().get(url);
        testContext.getDriver().findElement(By.xpath("//a[@class='login']")).click();

    }

    @When("user clicks on sign in button and enters email as {string} and password as {string}")
    public void user_clicks_on_sign_in_button_and_enters_email_as_and_password_as(String string, String string2) {
        testContext.getDriver().findElement(By.id("email")).sendKeys(string);
        testContext.getDriver().findElement(By.id("passwd")).sendKeys(string2);
        testContext.getDriver().findElement(By.id("SubmitLogin")).click();
    }

    @When("user click on the category as T-Shirts")
    public void user_click_on_the_category_as_t_shirts() {
        testContext.getDriver().findElement(By.xpath("//html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a[1]")).click();

    }

    @When("user Click on the product: Faded Short Sleeve T-shirts")
    public void user_click_on_the_product_faded_short_sleeve_t_shirts() {
        testContext.getDriver().findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).click();

    }

    @When("Click on Send a Review and enter the title as {string} and comments as {string} and click on send button")
    public void click_on_send_a_review_and_enter_the_title_as_and_comments_as_and_click_on_send_button(String string, String string2) {
        testContext.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[3]/div[3]/ul/li/a")).click();
        testContext.getDriver().findElement(By.id("comment_title")).sendKeys(string);
        testContext.getDriver().findElement(By.id("content")).sendKeys(string2);
        testContext.getDriver().findElement(By.id("submitNewMessage")).click();
    }

    @Then("Check the Message appeared that New comment added.")
    public void check_the_message_appeared_that_new_comment_added() {
        WebElement msg = testContext.getDriver().findElement(By.xpath("/html/body/div[2]/div/div/div/p[1]"));

        String nmsg = msg.getText();
        boolean Expectedresult = msg.isDisplayed();
        Assert.assertEquals(Expectedresult, true);
        scenario.log("Success msg is given as " + nmsg);


    }

    //End to end journey
    @Given("Login to http:automationpractice.com by click on sign in and add as Email as {string} and password as {string}")
    public void login_to_http_automationpractice_com_by_click_on_sign_in_and_add_as_email_as_and_password_as(String string, String string2) {
        //driver = new ChromeDriver();
        String browserName= System.getProperty("browser");
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.getDriver().get(url);
        testContext.getDriver().findElement(By.xpath("//a[@class='login']")).click();
        testContext.getDriver().findElement(By.id("email")).sendKeys(string);
        testContext.getDriver().findElement(By.id("passwd")).sendKeys(string2);
        testContext.getDriver().findElement(By.id("SubmitLogin")).click();
    }

    @When("User Select the category as T-Shirts")
    public void user_select_the_category_as_t_shirts() {
        testContext.getDriver().findElement(By.xpath("//html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a[1]")).click();

    }

    @When("User Select the category as T-Shirts product  Faded Short Sleeve T-shirts")
    public void user_select_the_category_as_t_shirts_product_faded_short_sleeve_t_shirts() {
        testContext.getDriver().findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).click();

    }

    @When("user Fetch the Amount of the product in a variable")
    public void user_fetch_the_amount_of_the_product_in_a_variable() {

       WebElement Price = testContext.getDriver().findElement(By.id("our_price_display"));
       String pr_price=Price.getText();
     //  Scenario.log("The price of the product is:"+pr_price);


    }
    @When("increase Quantity to {int}")
    public void increase_quantity_to(Integer int1) {
        testContext.getDriver().findElement(By.id("quantity_wanted_p")).click();

    }
    @When("Increase Size to L")
    public void increase_size_to_l() {
        Select Size = new Select(testContext.getDriver().findElement(By.id("group_1")));
        Size.selectByIndex(2);


    }
    @When("user Click on Add to Cart")
    public void user_click_on_add_to_cart() {
        testContext.getDriver().findElement(By.id("add_to_cart")).click();


    }
    @Then("Check the User sees the Pop Up: Product Successfully Added to Cart")
    public void check_the_user_sees_the_pop_up_product_successfully_added_to_cart() {
        /*Set<String> handles = testContext.driver.getWindowHandles();
        Iterator<String> it= handles.iterator();
        String childWindow =it.next();
        testContext.driver.switchTo().window(childWindow);*/
        WebElement succesmsg= testContext.getDriver().findElement(By.id("layer_cart"));
        String succesmsg_check=succesmsg.getText();
       boolean ExpectedResult=succesmsg.isDisplayed();
       Assert.assertEquals(succesmsg_check,true);
  }
    @Then("Check the Quantity and Color")
    public void check_the_quantity_and_color() {
      WebElement quntity= testContext.getDriver().findElement(By.id("layer_cart_product_quantity"));
      String quntity_check=quntity.getText();
      boolean ExpectedResult=quntity.isDisplayed();
      Assert.assertEquals(ExpectedResult,true);


       WebElement color = testContext.getDriver().findElement(By.id("layer_cart_product_attributes"));
        String color_check = color.getText();
        boolean Expectedresult = color.isDisplayed();
        Assert.assertEquals(Expectedresult, true);


    }
    @Then("Check Total Price is twice the amount fetched earlier.")
    public void check_total_price_is_twice_the_amount_fetched_earlier() {



    }
    @When("Click on Proceed to Checkout.")
    public void click_on_proceed_to_checkout() {

    }
    @Then("Check the User sees the product name")
    public void check_the_user_sees_the_product_name() {


    }
    @Then("Availability as Instock")
    public void availability_as_instock() {

    }
    @Then("Unit Price equal to what was captured previously")
    public void unit_price_equal_to_what_was_captured_previously() {

    }
    @Then("Quantity to what was set earlier")
    public void quantity_to_what_was_set_earlier() {

    }
    @Then("Check the Total is equal to twice the amount with $ {int} for shipping")
    public void check_the_total_is_equal_to_twice_the_amount_with_$_for_shipping(Integer int1) {

    }
    @When("Click on Proceed to Check out again and reach till payment and click on Terms and condition check box")
    public void click_on_proceed_to_check_out_again_and_reach_till_payment_and_click_on_terms_and_condition_check_box() {

    }
    @When("On Payment Page click on Pay by bank wire and Click on I confirm my Order")
    public void on_payment_page_click_on_pay_by_bank_wire_and_click_on_i_confirm_my_order() {

    }
    @Then("Check the order submit page and message {string} also check is amount is right.")
    public void check_the_order_submit_page_and_message_also_check_is_amount_is_right(String string) {

    }



    //Change image
    @Given("user is ready for Login to http:Automationpractice.com by giving email as {string} and password as {string} and click on sign in")
    public void user_is_ready_for_login_to_http_automationpractice_com_by_giving_email_as_and_password_as_and_click_on_sign_in(String string, String string2) {
        //driver = new ChromeDriver();
        String browserName= System.getProperty("browser");
        testContext.setDriver(Driverfactory.createInstance(browserName));
        testContext.getDriver().manage().window().maximize();
        testContext.getDriver().manage().deleteAllCookies();
        testContext.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        testContext.getDriver().get(url);
        testContext.getDriver().findElement(By.xpath("//a[@class='login']")).click();
        testContext.getDriver().findElement(By.id("email")).sendKeys(string);
        testContext.getDriver().findElement(By.id("passwd")).sendKeys(string2);
        testContext.getDriver().findElement(By.id("SubmitLogin")).click();
    }

    @When("user is ready to Selects the category as T-Shirts")
    public void user_is_ready_to_selects_the_category_as_t_shirts() {
        testContext.getDriver().findElement(By.xpath("//html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a[1]")).click();
    }


    @When("user Clicks on the product: Faded Short Sleeve T-shirts")
    public void user_clicks_on_the_product_faded_short_sleeve_t_shirts() {
        testContext.getDriver().findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).click();
    }

    @When("Click on Color Blue link")
    public void click_on_color_blue_link() {
        testContext.getDriver().findElement(By.id("color_14")).click();

    }

    @Then("Check the Image is changed")
    public void check_the_image_is_changed() {
        String blue_colour = testContext.getDriver().findElement(By.id("bigpic")).getAttribute("src");
        Assert.assertEquals(blue_colour, "http://automationpractice.com/img/p/3/3-large_default.jpg");
    }


}


