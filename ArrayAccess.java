import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Length of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array: ");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        try {
            for(int i=0;i<=arr.length;i++){
                System.out.println("Element at index "+i+" : "+arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Error: Array index out of bounds.");
        }
    }
    
}
