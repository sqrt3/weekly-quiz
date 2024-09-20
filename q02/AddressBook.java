package weekly.q02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private static List<Contact> contacts = new ArrayList<>();

    public static void displayContacts() {
        for (Contact c : contacts) {
            System.out.println(c.toString());
        }
    }

    public static void searchContact(String name) {
        int cnt = 0;
        for (Contact c : contacts) {
            if (name.equals(c.name)) {
                cnt++;
                System.out.println(c.toString());
            }
        }
        if (cnt == 0) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }

    public static void main(String[] args) {
        String name, phone, company, relationship;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1. 비즈니스 연락처 추가\n"
                            + "2. 개인 연락처 추가\n"
                            + "3. 연락처 출력\n"
                            + "4. 연락처 검색\n"
                            + "5. 종료\n"
                            + "메뉴를 선택해주세요: ");
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("이름을 입력하세요:");
                    name = sc.nextLine();
                    System.out.println("전화번호를 입력하세요:");
                    phone = sc.nextLine();
                    System.out.println("회사명을 입력하세요:");
                    company = sc.nextLine();
                    contacts.add(new BusinessContact(name, phone, company));
                    break;
                case "2":
                    System.out.println("이름을 입력하세요:");
                    name = sc.nextLine();
                    System.out.println("전화번호를 입력하세요:");
                    phone = sc.nextLine();
                    System.out.println("관계를 입력하세요:");
                    relationship = sc.nextLine();
                    contacts.add(new PersonalContact(name, phone, relationship));
                    break;
                case "3":
                    if (contacts.size() == 0) {
                        System.out.println("연락처가 비어있습니다.");
                    } else {
                        displayContacts();
                    }
                    break;
                case "4":
                    System.out.println("검색할 이름을 입력하세요:");
                    name = sc.nextLine();
                    searchContact(name);
                    break;
                case "5":
                    sc.close();
                    return;
            }
        }
    }
}
