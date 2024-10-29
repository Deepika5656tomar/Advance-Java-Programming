import java.util.HashMap;

public class HashMapEmptyCheck {

    public static void main(String[] args) {
        // Step 1: Create an empty HashMap with String as key type and Integer as value type
        HashMap<String, Integer> map = new HashMap<>();

        // Step 2: Check if the HashMap is empty before adding any elements
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        // Step 3: Add some key-value pairs to the HashMap
        map.put("Alice", 85);
        map.put("Bob", 90);

        // Step 4: Check again if the HashMap is empty after adding elements
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap is not empty.");
        }

        // Step 5: Display the contents of the HashMap
        System.out.println("HashMap contents: " + map);
    }
}
