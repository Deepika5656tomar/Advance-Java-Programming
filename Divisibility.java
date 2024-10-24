import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        if(n%7==0){
            System.out.println(n+" is divisible by 7.");
        }else{
            System.out.println(n+" not divisible by 7.");
        }
    }
}
