import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5 };
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[i] = arr[j];
            j++;
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
