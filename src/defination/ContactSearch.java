package defination;

import adt.ContactSearchADT;

import java.util.ArrayList;
import java.util.Collection;

public class ContactSearch<E> implements ContactSearchADT {
    @Override
    public void searchContact(String Name) {
        int flag = 0;
        ArrayList contacts = new ArrayList(Database.getConBook());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            if ((contact.get(0) + " " + contact.get(1)).equals(Name)) {
                flag = 1;
                System.out.println("");
                printSearchedContact((ArrayList) contacts.get(i));
                break;
            }
        }
        if (flag == 0) {
            System.out.println("Contact not found in search");
        }
    }

    @Override
    public void printSearchedContact(ArrayList contact) {
        if (contact.size() == 5) {
            System.out.println("--------------------------------------------");
            System.out.println("Name=" + contact.get(0) + " " + contact.get(1));
            System.out.println("Mobile no(s)=" + contact.get(2) + "," + contact.get(3));
            System.out.println("Email id=" + contact.get(4) + "\n");
            System.out.println("--------------------------------------------");

        } else {
            System.out.println("--------------------------------------------");
            System.out.println("Name=" + contact.get(0) + " " + contact.get(1));
            System.out.println("Mobile no=" + contact.get(2));
            System.out.println("Email id=" + contact.get(3) + "\n");
            System.out.println("--------------------------------------------");

        }

    }
}
