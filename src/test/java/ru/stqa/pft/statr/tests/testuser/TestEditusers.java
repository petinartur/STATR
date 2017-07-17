package ru.stqa.pft.statr.tests.testuser;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class TestEditusers extends TestBase {
    @Test
    public void testeditusers() throws InterruptedException {

        app.goToUsers();
        Thread.sleep(50000);
        app.poiskuser();
        app.editusers();
        Thread.sleep(20000);


    }
}

