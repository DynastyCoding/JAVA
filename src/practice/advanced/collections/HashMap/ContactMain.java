package practice.advanced.collections.HashMap;

public class ContactMain {
    public static void main(String[] args) {
        ContactBook book = new ContactBook();

        book.addContact("Duke", "0911-111-111");
        book.addContact("Levi", "0922-222-222");
        book.addContact("Chovy", "0933-333-333");

        // 更新 Duke 的電話
        book.addContact("Duke", "0988-888-888");

        System.out.println("Duke's phone: " + book.getPhone("Duke"));   // 0988-888-888
        System.out.println("Faker's phone: " + book.getPhone("Faker")); // Not found

        System.out.println("Total contacts: " + book.getTotalContacts()); // 3

        System.out.println("Remove Levi: " + book.removeContact("Levi"));   // true
        System.out.println("Remove Faker: " + book.removeContact("Faker")); // false

        System.out.println("Total contacts: " + book.getTotalContacts()); // 2

        book.printAllContacts();
        // Chovy -> 0933-333-333
        // Duke -> 0988-888-888
    }
}
