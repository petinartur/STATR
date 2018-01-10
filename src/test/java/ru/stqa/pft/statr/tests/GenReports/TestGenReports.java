package ru.stqa.pft.statr.tests.GenReports;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

public class TestGenReports extends TestBase {
    @Test
    public void testGenReports() throws InterruptedException {
        app.goToGenReports();
        Thread.sleep(5000);
        app.genReports();
        Thread.sleep(30000);
        app.deleteGenReports();
        Thread.sleep(5000);
    }
}
