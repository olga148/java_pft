package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.gotoContactPage();
        app.fillContactForm(new ContactData("olga", "shakhova", "+79904459058", "olga@mail.com", "testolga@gmail.com", "testingolga@mail.com"));
        app.submitContactCreation();
        app.returnToHomePage();
    }

}
