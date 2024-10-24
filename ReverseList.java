import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        
        // Add some elements to the list
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");

        System.out.println("Original List: " + stringList);

        // Reverse the list using Collections.reverse()
        Collections.reverse(stringList);

        System.out.println("Reversed List: " + stringList);
    }
}
