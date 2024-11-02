package org.example;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, String> contacts;

    public PhoneBook() {
        contacts = new TreeMap<>();
    }

    public int add(String name, String phone) {
        if (!contacts.containsKey(name)) {
            contacts.put(name, phone);
        }
        return contacts.size();
    }
}
