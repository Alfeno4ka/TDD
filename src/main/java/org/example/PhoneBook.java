package org.example;

import java.util.List;
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

    public List<String> findByNumber(String phone) {
        return contacts.entrySet().stream()
                .filter(contact -> contact.getValue().equals(phone))
                .map(contact -> contact.getKey())
                .toList();
    }

    public String findByName(String name) {
        return contacts.get(name);
    }

    public List<String> printAllNames (){
        return contacts.keySet().stream().toList();
    }


}
