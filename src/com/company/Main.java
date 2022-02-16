package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person person1 = new Person("Tucker","tucker@gmail.com");
        Person person2 = new Person("Sam","sam@yahoo.com");
        AddressBook.addContact(person1);
        AddressBook.addContact(person2);
        AddressBook.searchContacts();
    }
}
