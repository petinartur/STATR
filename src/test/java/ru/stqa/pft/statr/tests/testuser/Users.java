package ru.stqa.pft.statr.tests.testuser;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class Users extends TestBase {
    @Test
    public void testUsers() throws InterruptedException {

        app.goToUsers();
        Thread.sleep(50000);
        app.createusers();
        Thread.sleep(20000);


    }
}

