package defination;

import adt.ContactDeleteADT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ContactDelete<E> implements ContactDeleteADT {
    @Override
    public boolean deleteContact() {
        Scanner in = new Scanner(System.in);
        System.out.println("here are all the names of your contact sorted");
        System.out.println("----------------------------------------------------------");
        ArrayList contactNames = new ArrayList();
        ArrayList contacts = new ArrayList(Database.getConBook());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            contactNames.add(contact.get(0) + " " + contact.get(1));
        }
        Collections.sort(contactNames, String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < contactNames.size(); i++) {
            System.out.println(contactNames.get(i).toString());
        }
        System.out.println("enter the name to be deleted");
        in.nextLine();
        String name = in.nextLine();
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
