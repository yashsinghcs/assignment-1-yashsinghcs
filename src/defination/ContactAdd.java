package defination;

import adt.ContactAddADT;

import java.util.ArrayList;

public class ContactAdd<E> implements ContactAddADT<E> {
    @Override
    public boolean addContact(String fname, String lname, String MobNo, String Mob2, String Email) {
        ArrayList contact;
        if (Mob2 != null) {
            contact = new ArrayList();
            contact.add(fname);
            contact.add(lname);
            contact.add(MobNo);
            contact.add(Mob2);
            contact.add(Email);
            Database.setConBook(contact);
        } else {
            contact = new ArrayList();
            contact.add(fname);
            contact.add(lname);
            contact.add(MobNo);
            contact.add(Email);
            Database.setConBook(contact);
        }

        return true;
    }
}
