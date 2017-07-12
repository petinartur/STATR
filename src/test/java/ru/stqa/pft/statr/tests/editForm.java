package ru.stqa.pft.statr.tests;

import org.testng.annotations.Test;

/**
 * Created by artur.petin on 13.04.2017.
 */
public class editForm extends TestBase {

    @Test
    public void testeditForm() {
        app.goToFormPage();
        app.editForm();


    }

}
