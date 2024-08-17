package org.example;

public class Source {

    private String gender;
    private Contact contact;

    public Source(String gender) {
        this.gender = gender;
    }

    public Source() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }
}
