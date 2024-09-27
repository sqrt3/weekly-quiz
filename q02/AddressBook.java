package weekly.q02;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private static List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        }
        for (Contact c : contacts) {
            System.out.println(c.toString());
        }
    }

    public void searchContact(String name) {
        boolean chk = false;
        for (Contact c : contacts) {
            if (name.equals(c.name)) {
                if (!chk)
                    chk = true;
                System.out.println(c);
            }
        }
        if (!chk) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }

    public void add(Contact c) {
        contacts.add(c);
    }
}
