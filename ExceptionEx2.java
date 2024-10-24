import java.util.Scanner;

public class ExceptionEx2 {
    public static void fun(int n){
        if(n==2)
        throw new ArithmeticException();
        else
        System.out.println("The number is: "+n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        try {
            fun(n); 
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Enter any number except 2.");
        }
    }
}
