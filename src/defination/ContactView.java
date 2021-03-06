package defination;

import adt.ContactViewADT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ContactView<E> implements ContactViewADT {


    @Override
    public void printAllContact() {
        ArrayList contactNames = new ArrayList();
        ArrayList contacts = new ArrayList(Database.getConBook());
        for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            contactNames.add(contact.get(0) + " " + contact.get(1));
        }
        Collections.sort(contactNames, String.CASE_INSENSITIVE_ORDER);
        /*for (int i = 0; i < contactNames.size(); i++) {
            System.out.println(contactNames.get(i).toString());
        }*/
        System.out.println("-----------------------------------------------------------");
        System.out.println("Here are the list of contacts with sorted ");

        /*for (int i = 0; i < contacts.size(); i++) {
            ArrayList contact = new ArrayList((Collection) contacts.get(i));
            if (contact.size() == 5) {
           *//*     System.out.println("--------------------------------------------");
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

            }*//*

        }*/
        for (Object name : contactNames) {

            for (int i = 0; i < contacts.size(); i++) {
                ArrayList contact = new ArrayList((Collection) contacts.get(i));
                if (name.equals(contact.get(0) + " " + contact.get(1))) {
                    if (contact.size() >= 5) {
                        System.out.println("--------------------------------------------");
                        System.out.println("Name=" + contact.get(0) + " " + contact.get(1));
                        System.out.print("Mobile no(s)=");
                        for (int k = 2; k < contact.size() - 1; k++) {
                            System.out.print(contact.get(k) + (k < contact.size() - 2 ? "," : ""));
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

        }


    }

    @Override
    public E printAllContactactSort() {
        return null;
    }

}
