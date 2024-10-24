import java.util.HashSet;

public class AppendToHashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add initial elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Append a specified element
        String elementToAppend = "Date";
        hashSet.add(elementToAppend);

        // Display the HashSet
        System.out.println("Updated HashSet: " + hashSet);
    }
}
