package defination;

import adt.ContactAddADT;

import java.util.ArrayList;

public class ContactAdd<E> implements ContactAddADT<E> {
    @Override
    public boolean addContact(String fname, String lname, ArrayList mobnos, String Email) {
        ArrayList contact = new ArrayList();
        contact.add(fname);
        contact.add(lname);
        for (int i = 0; i < mobnos.size(); i++) {
            contact.add(mobnos.get(i));
        }
        contact.add(Email);
        Database.setConBook(contact);

        return true;
    }
}
