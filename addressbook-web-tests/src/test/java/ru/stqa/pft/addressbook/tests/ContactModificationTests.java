package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();
        int before = app.getContactHelper().getContactCount();
        if (!app.getContactHelper().isThereAContact()) {
            app.navigationHelper.gotoContactPage(app);
            app.getContactHelper().createContact(new ContactData("olga", "shakhova", "+79904459058", "olga@mail.com", "testolga@gmail.com", "testingolga@mail.com"));
        }
        app.getContactHelper().initContactModification(before-1);
        app.getContactHelper().fillContactForm(new ContactData("olya", "tester", "+79904459056", "olga32@mail.com", "testolga21@gmail.com", "testingolga44@mail.com"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);
    }
}
