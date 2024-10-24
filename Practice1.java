import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<>();
        ArrayList<Integer> a2=new ArrayList<>();
        a1.add(1);
        a1.add(2);
        a2.add(2);
        a2.add(3);
        Set<Integer> union=new HashSet<>(a1);
        // a1.removeAll(a2);
        // a1.retainAll(a2);
        //a1.addAll(a2);
        union.addAll(a2);
        System.out.println(union);
    }
}
