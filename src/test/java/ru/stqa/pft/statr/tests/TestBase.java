package ru.stqa.pft.statr.tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.pft.statr.appmanager.ApplicationManager;

/**
 * Created by artur.petin on 27.09.2016.
 */
public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod

    public void setUp() throws Exception {
        app.init();
    }


    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
