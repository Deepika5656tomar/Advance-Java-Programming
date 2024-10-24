import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int total=a+b+c;
        String Grade;
        float avg=total/3;
        if(avg>=90){
            Grade="A";
        }else if(avg>=70){
            Grade="B";
        }else if(avg>=50){
            Grade="C";
        }else if(avg>=40){
            Grade="PASS";
        }else{
            Grade="FAIL";
        }
        System.out.println("Total of marks: "+total);
        System.out.println("Average of marks: "+avg);
        System.out.println("Grade: "+Grade);
    }
}
