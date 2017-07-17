package ru.stqa.pft.statr.tests.usergroup;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class TestUserGroup extends TestBase {
    @Test
    public void testUserGroup() throws InterruptedException {
        app.goToUsersGroup();
        Thread.sleep(10000);
        app.createUsersGroup();
        Thread.sleep(10000);
        app.deleteUserGroup();
        Thread.sleep(20000);
    }
}

