package defination;

import adt.ContactDeleteADT;

import java.util.ArrayList;
import java.util.Collection;

public class ContactDelete<E> implements ContactDeleteADT {
    @Override
    public boolean deleteContact(String name) {
        ArrayList contacts = new ArrayList(Database.getConBook());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            if ((contact.get(0) + " " + contact.get(1)).equals(name)) {
                Database.removecontact(i);
                System.out.println("Contact deleted sucessfully");
                return true;
            }
        }
        System.out.println("Contact not found or some error has occured");
        return false;
    }

}
