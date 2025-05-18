import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();

        emails.add("user1@example.com");
        emails.add("user2@example.com");
        emails.add("user1@example.com"); // Duplicate

        System.out.println("Unique Emails:");
        for (String email : emails) {
            System.out.println(email);
        }
    }
}
