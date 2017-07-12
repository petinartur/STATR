package ru.stqa.pft.statr.tests;

import org.testng.annotations.Test;



public class Forms extends TestBase {

    @Test
    public void testOpen() {
        app.goToFormPage();
        app.createForm();

    }

}
