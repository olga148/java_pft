package ru.stqa.pft.addressbook;

public class ContactData {
    private final String firstname;
    private final String lastname;
    private final String phone;
    private final String email;
    private final String email2;
    private final String email3;

    public ContactData(String firstname, String lastname, String phone, String email, String email2, String email3) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }
}
