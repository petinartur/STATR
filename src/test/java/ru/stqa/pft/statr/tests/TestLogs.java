package ru.stqa.pft.statr.tests;

import org.testng.annotations.Test;

/**
 * Created by artur.petin on 03.10.2016.
 */
public class TestLogs extends TestBase {
    @Test
    public void testLogs() {
        app.goToLogs();
    }
}

