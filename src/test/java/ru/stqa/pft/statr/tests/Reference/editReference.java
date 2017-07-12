package ru.stqa.pft.statr.tests.Reference;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class editReference extends TestBase {
    @Test
    public void testeditReference() throws InterruptedException {
        app.goToReference();
        Thread.sleep(10000);
        app.editReference();
        Thread.sleep(1000);
    }
}

