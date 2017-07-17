package ru.stqa.pft.statr.tests.Form;

import org.testng.annotations.Test;
import ru.stqa.pft.statr.tests.TestBase;


public class TestForms extends TestBase {

    @Test
    public void testOpen() throws InterruptedException {
        app.goToFormPage();
        app.createForm();
        Thread.sleep(10000);
        app.editForm();
        Thread.sleep(10000);
        app.deleteForm();
        Thread.sleep(10000);
    }

}
