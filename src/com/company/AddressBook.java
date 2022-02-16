package com.company;

// purpose : a collection of contact information for many people
// method : adding new contact information
// method : searching the existing collection for a contacts email address when the name is specified.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class AddressBook {

    static Map<String, String> addressMap = new HashMap<String, String>();


    static void addContact(Person a){
        addressMap.put(a.getName(), a.getEmailAddress());
        System.out.println(addressMap);
    }
    static void searchContacts(){
        Scanner input = new Scanner(System.in);
        System.out.println("Who's email address would you like to find?");
        String name = input.nextLine();
        System.out.println(addressMap.get(name));
    }
}
