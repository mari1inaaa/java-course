package edu.hw3.Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    private Sort() {

    }

    public static List<Contact> parseContacts(String[] contacts, String sortType) {
        if (contacts == null || contacts.length == 0) {
            return new ArrayList<>();
        }
        List<Contact> orderedContacts = new ArrayList<>();
        for (String contact : contacts) {
            orderedContacts.add(new Contact(contact));
        }
        if (sortType.equals("ASC")) {
            for (int i = 0; i < orderedContacts.size() - 1; i++) {
                for (int j = i + 1; j < orderedContacts.size(); j++) {
                    if (orderedContacts.get(i).getLastName().compareTo(orderedContacts.get(j).getLastName()) > 0) {
                        Collections.swap(orderedContacts, i, j);
                    }
                }
            }
        } else if (sortType.equals("DESC")) {
            for (int i = 0; i < orderedContacts.size() - 1; i++) {
                for (int j = i + 1; j < orderedContacts.size(); j++) {
                    if (orderedContacts.get(i).getLastName().compareTo(orderedContacts.get(j).getLastName()) < 0) {
                        Collections.swap(orderedContacts, i, j);
                    }
                }
            }
        }
        return orderedContacts;
    }
}
