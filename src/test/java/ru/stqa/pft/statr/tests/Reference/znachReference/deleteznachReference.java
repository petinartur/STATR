package ru.stqa.pft.statr.tests.Reference.znachReference;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 11.04.2017.
 */
public class deleteznachReference extends TestBase {
    @Test
    public void testReference() throws InterruptedException {

        app.goToReference();
        app.goToZnachReference();
        Thread.sleep(1000);
        app.deleteZnachReference();
        Thread.sleep(1000);


    }
}
