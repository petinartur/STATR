package ru.stqa.pft.statr.tests.GenDocument;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 19.04.2017.
 */
public class GenDocument extends TestBase {

    @Test
    public void testGenDocument() throws InterruptedException {
        app.goToGenDocument();
        Thread.sleep(10000);
        app.createGenDocument();
        Thread.sleep(10000);

    }

}

