import java.util.HashMap;

public class HashMapExample2 {
    public static void main(String[] args) {
        // Create a HashMap to store key-value pairs
        HashMap<String, Integer> map = new HashMap<>();

        // Add initial key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Display the original HashMap
        System.out.println("Original HashMap: " + map);

        // Associate a specified value with a specified key
        String key = "Grapes";
        Integer value = 4;
        map.put(key, value);

        // Display the updated HashMap
        System.out.println("Updated HashMap after adding " + key + ": " + map);
    }
}
