package ru.stqa.pft.statr.tests.Reference;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class TestReference extends TestBase {
    @Test
    public void testReference() throws InterruptedException {
        app.goToReference();
        Thread.sleep(10000);
        app.createReference();
        Thread.sleep(10000);
        app.goToZnachReference();
        Thread.sleep(10000);
        app.createZnachReference();
        Thread.sleep(10000);
        app.editZnachReference();
        Thread.sleep(10000);
        app.deleteZnachReference();
        Thread.sleep(10000);
        app.backToReference();
        Thread.sleep(10000);
        app.editReference();
        Thread.sleep(10000);
        app.deleteReference();
        Thread.sleep(10000);
    }
}

