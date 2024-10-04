package org.example.mobile;

import java.util.List;

public class MobilePhone {

    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> contacts) {
        this.myNumber = myNumber;
        this.myContacts = contacts;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact contact) {
        return myContacts.contains(contact) ? false : myContacts.add(contact);
//        if (myContacts.contains(contact))
//            return false;
//
//        myContacts.add(contact);
//        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int index = myContacts.indexOf(oldContact);

        if (index == -1)
            return false;

        myContacts.set(index, newContact);

        return true;
    }

    public boolean removeContact(Contact contact) {
        return myContacts.remove(contact);
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String name) {
        return myContacts.indexOf(new Contact(name, ""));
    }

    public Contact queryContact(String name) {

        int index = myContacts.indexOf(new Contact(name, ""));

        return index == -1 ? null : myContacts.get(index);
    }

    public void printContact() {

        for (Contact contact : myContacts) {
            System.out.println(contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }
}
