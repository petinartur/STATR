package ru.stqa.pft.statr.tests.testuser;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class TestUsers extends TestBase {
    @Test
    public void testUsers() throws InterruptedException {

        app.goToUsers();
        Thread.sleep(5000);
        app.createusers();
        Thread.sleep(20000);
        app.poiskuser();
        app.editusers();
        Thread.sleep(2000);
        app.deleteusers();
        Thread.sleep(20000);

    }
}

