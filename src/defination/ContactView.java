package defination;

import adt.ContactViewADT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ContactView<E> implements ContactViewADT {


    @Override
    public void printAllContact() {

        ArrayList  contacts = new ArrayList(Database.getConBook());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList  contact = new ArrayList((Collection) contacts.get(i));
            for (int j = 0; j <contacts.size() ; j++) {


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

            }}


        }


    }

    @Override
    public E printAllContactactSort()
    {ArrayList contactNames=new ArrayList();
        ArrayList  contacts = new ArrayList(Database.getConBook());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList  contact = new ArrayList((Collection) contacts.get(i));
            contactNames.add(contact.get(0));
        }
        Collections.sort(contactNames);
        for (int i = 0; i < contactNames.size(); i++) {
            System.out.println(contactNames.get(i).toString());

        }
        return null;
    }

}
