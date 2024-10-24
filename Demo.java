import java.util.*;
/* class Demo1 extends Thread{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition started");
        System.out.println("Enter first no: ");
        int a =sc.nextInt();
        System.out.println("Enter second no: ");
        int b = sc.nextInt();
        int c= a+b;
        System.out.println("Addition is:"+c);
        System.out.println("Addition complteted.");
    }
} */
class Demo1 implements Runnable{
    public void run(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Addition started");
        System.out.println("Enter first no: ");
        int a =sc.nextInt();
        System.out.println("Enter second no: ");
        int b = sc.nextInt();
        int c= a+b;
        System.out.println("Addition is:"+c);
        System.out.println("Addition complteted.");
    }
}
/* class Demo2 extends Thread{
    public void run(){
        System.out.println("Number printing: ");
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed...");
    }
} */
class Demo2 implements Runnable{
    public void run(){
        System.out.println("Number printing: ");
        for(int i=0;i<=5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Number printing task completed...");
    }
}

public class Demo {
    public static void main(String[] args) throws Exception {
        Demo1 d1=new Demo1();
        Demo2 d2= new Demo2();
        //d1.start();
        //d2.start();
        Thread t1= new Thread(d1);
        Thread t2= new Thread(d2);
        t1.start();
        t2.start();
    }
}
