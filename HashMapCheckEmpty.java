import java.util.HashMap;

public class HashMapCheckEmpty {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }

        // Add key-value mappings to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);

        // Check again if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
    }
}
