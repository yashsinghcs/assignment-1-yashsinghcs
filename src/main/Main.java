/**
 * @author : yashsinghcs
 */
package main;

import defination.ContactAdd;
import defination.ContactDelete;
import defination.ContactSearch;
import defination.ContactView;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactAdd contactAdd = new ContactAdd();
        ContactView contactView = new ContactView();
        ContactDelete contactDelete = new ContactDelete();
        ContactSearch contactSearch = new ContactSearch();
        System.out.println("---------------------------------------------------");
        System.out.println("Welcome to YASH's Contact List");
        String fname, lname, MobNo, Mob2, EmailID;
        while (true) {
            System.out.println("---------------------------------------------------");
            Scanner in = new Scanner(System.in);
            System.out.println("1.ADD NEW CONTACT\n2.CONTACT VIEW\n3.CONTACT DELETE\n4.CONTACT SEARCH");
            System.out.println("Enter your choice");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    ArrayList mobilenos = new ArrayList();
                    System.out.println("Enter the firstName:");
                    fname = in.next();
                    System.out.println("Enter the lastName:");
                    lname = in.next();
                    System.out.println("Enter the Mobile NO:");
                    MobNo = in.next();
                    if (MobNo.length() != 10 || MobNo.matches("a-zA-Z")) {
                        System.out.println("mobile no error PLEASE try again");
                        continue;
                    } else {
                        mobilenos.add(MobNo);
                        for (int i = 0; i < 1000; i++) {
                            System.out.println("would you like to add  another contact(y/n)?:");
                            String value = in.next();
                            in.nextLine();
                            if (value.equals("y") || value.equals("Y")) {
                                System.out.println("mob no:");
                                MobNo = in.next();

                                if (MobNo.length() != 10 || MobNo.matches("a-zA-Z")) {
                                    System.out.println("mobile no error PLEASE try again");
                                    break;
                                } else {
                                    mobilenos.add(MobNo);
                                }
                            } else if (value.equals("N") || value.equals("n")) {
                                break;
                            } else {
                                System.out.println("enter valid charerter");
                            }

                        }
                    }


                    System.out.println("Enter the EMail ID:");
                    EmailID = in.next();
                    contactAdd.addContact(fname, lname, mobilenos, EmailID);
                    break;
                case 2:
                    contactView.printAllContact();
//                    System.out.println(  Database.getConBook());
                    break;
                case 3:

                    contactDelete.deleteContact();
                    break;
                case 4:
                    System.out.println("enter the full name of the person");
                    in.nextLine();
                    String name = in.nextLine();
                    contactSearch.searchContact(name);
                    break;
                default:
                    System.out.println("invalid input " + "PLEASE TRY AGAIN!!!!!");
                    break;

            }

        }


    }
}
