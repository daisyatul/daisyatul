package utilis;

import org.testng.Assert;

import java.util.Properties;

public class BaseTest {

    protected String url;
    protected String email;
    //protected String password;


    public BaseTest() {
        readProperties();
    }


    public void readProperties() {
        try {
            Properties properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
            // properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
            this.url = (String) properties.get("url");
            this.email = (String) properties.get("user_name");
            // this.password = (String) properties.get("pass");
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail("config.properties file not found");
        }


    }

}