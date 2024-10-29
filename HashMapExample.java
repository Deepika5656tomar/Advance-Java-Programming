import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        // Step 1: Create a HashMap with String as key type and Integer as value type
        HashMap<String, Integer> map = new HashMap<>();

        // Step 2: Add elements to the HashMap using the put() method
        // Associates "Alice" with 85
        map.put("Alice", 85);

        // Associates "Bob" with 90
        map.put("Bob", 90);

        // Associates "Charlie" with 75
        map.put("Charlie", 75);

        // Step 3: Print the entire HashMap to show all key-value pairs
        System.out.println("HashMap before adding a new entry: " + map);

        // Step 4: Associate a specified value with a specified key in the HashMap
        // Here, we add the key "David" with the value 95
        map.put("David", 95);

        // Step 5: Print the HashMap after adding the new key-value pair
        System.out.println("HashMap after adding a new entry: " + map);
    }
}
