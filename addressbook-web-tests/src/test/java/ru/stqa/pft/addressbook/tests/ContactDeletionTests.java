package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        app.navigationHelper.gotoContactPage(app);
        if (!app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("olga", "shakhova", "+79904459058", "olga@mail.com", "testolga@gmail.com", "testingolga@mail.com"));
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().deleteSelectedContact();
    }
}
