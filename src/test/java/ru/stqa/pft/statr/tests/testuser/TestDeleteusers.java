package ru.stqa.pft.statr.tests.testuser;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class TestDeleteusers extends TestBase {
    @Test
    public void testdeleteusers() throws InterruptedException {

        app.goToUsers();
        Thread.sleep(50000);
        app.poiskuser();
        app.deleteusers();
        Thread.sleep(20000);


    }
}

