package ru.stqa.pft.statr.tests.status;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class editstatus extends TestBase {
    @Test
    public void testeditstatus() throws InterruptedException {

        app.goToStatus();
        Thread.sleep(10000);
        app.editstatus();
        Thread.sleep(10000);
    }
}
