package ru.stqa.pft.statr.tests.Reference;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class deleteReference extends TestBase {
    @Test
    public void deleteReference() throws InterruptedException {
        app.goToReference();
        Thread.sleep(10000);
        app.deleteReference();
        Thread.sleep(10000);
    }
}

