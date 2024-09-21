package weekly.q02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, phone, company, relationship;
        AddressBook ab = new AddressBook();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    """
                            1. 비즈니스 연락처 추가
                            2. 개인 연락처 추가
                            3. 연락처 출력
                            4. 연락처 검색
                            5. 종료
                            메뉴를 선택해주세요:\s""");
            switch (sc.nextLine()) {
                case "1":
                    System.out.println("이름을 입력하세요:");
                    name = sc.nextLine();
                    System.out.println("전화번호를 입력하세요:");
                    phone = sc.nextLine();
                    System.out.println("회사명을 입력하세요:");
                    company = sc.nextLine();
                    ab.contacts.add(new BusinessContact(name, phone, company));
                    break;
                case "2":
                    System.out.println("이름을 입력하세요:");
                    name = sc.nextLine();
                    System.out.println("전화번호를 입력하세요:");
                    phone = sc.nextLine();
                    System.out.println("관계를 입력하세요:");
                    relationship = sc.nextLine();
                    ab.contacts.add(new PersonalContact(name, phone, relationship));
                    break;
                case "3":
                    ab.displayContacts();
                    break;
                case "4":
                    System.out.println("검색할 이름을 입력하세요:");
                    name = sc.nextLine();
                    ab.searchContact(name);
                    break;
                case "5":
                    sc.close();
                    return;
                default:
                    System.out.println("올바르지 않은 입력입니다.");
                    break;
            }
        }
    }
}
