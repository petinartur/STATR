package ru.stqa.pft.statr.tests.status;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class TestDeletestatus extends TestBase {
    @Test
    public void testdeletestatus() throws InterruptedException {

        app.goToStatus();
        app.deletestatus();
        Thread.sleep(1000);
    }
}
