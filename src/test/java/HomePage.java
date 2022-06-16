import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.BasicOperations;

import java.io.IOException;

public class HomePage extends BasicOperations {

    @BeforeTest
    public void start() throws Exception {
        driver = startDriver();
    }

    @Test
    public void base() {

        driver.get(data.getProperty("url"));

    }
}
