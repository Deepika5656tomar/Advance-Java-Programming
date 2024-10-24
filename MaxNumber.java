import java.util.*;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int maximum= (a>=b)?a:b;
        System.out.println("Maximum number between "+a+" and "+b+" is "+ maximum);

    }
}
