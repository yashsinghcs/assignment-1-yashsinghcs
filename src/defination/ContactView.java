package defination;

import adt.ContactViewADT;

import java.util.ArrayList;
import java.util.Collection;

public class ContactView<E> implements ContactViewADT {


    @Override
    public void printAllContact() {

        ArrayList contacts = new ArrayList(Database.getConBook());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            if (contact.size() == 5) {
                System.out.println("--------------------------------------------");
                System.out.println("Name=" + contact.get(0) + " " + contact.get(1));
                System.out.print("Mobile no(s)=");
                for (int k = 2; k < contact.size() - 1; k++) {

                    System.out.print(contact.get(k) + ",");
                }
                System.out.println("");
                System.out.println("Email id=" + contact.get(contact.size() - 1) + "\n");
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

    @Override
    public E printAllContactactSort() {
        return null;
    }

}
