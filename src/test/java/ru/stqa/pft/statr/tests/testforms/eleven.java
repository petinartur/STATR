package ru.stqa.pft.statr.tests.testforms;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 27.03.2017.
 */
public class eleven extends TestBase {
    @Test
    public void testStatistics() throws InterruptedException {
        app.goToStatistics();
        Thread.sleep(10000);
        app.proverka244();
        app.chistca();

    }
}
