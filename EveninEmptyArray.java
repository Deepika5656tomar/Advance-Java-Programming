import java.util.ArrayList;
import java.util.Scanner;

public class EveninEmptyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> evenArr=new ArrayList<>();
        System.out.println("Enter number of elements in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenArr.add(arr[i]);
            }
        }
        System.out.println(evenArr);

    }
}
