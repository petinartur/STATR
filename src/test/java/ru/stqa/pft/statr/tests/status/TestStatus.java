package ru.stqa.pft.statr.tests.status;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class TestStatus extends TestBase {
    @Test
    public void testStatus() throws InterruptedException {

        app.goToStatus();
        app.createstatus();
        Thread.sleep(1000);
    }
}

