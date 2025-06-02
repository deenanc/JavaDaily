package collections;
import java.util.HashMap;
import java.util.Scanner;

public class DynamicHashMapInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key (int): ");
            int key = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter value (String): ");
            String value = scanner.nextLine();

            map.put(key, value);
        }

        System.out.println("\nHashMap contents:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        scanner.close();
    }
}
