// 25. HashMap Example
import java.util.HashMap;
import java.util.Scanner;

public class Exercise25 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();  // consume newline
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = sc.nextInt();
        System.out.println("Student: " + studentMap.getOrDefault(searchId, "Not found"));
    }
}