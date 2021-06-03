package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        gotoContactPage();
        fillContactForm(new ContactData("olga", "shakhova", "+79904459058", "olga@mail.com", "testolga@gmail.com", "testingolga@mail.com"));
        submitContactCreation();
        returnToHomePage();
    }

}
