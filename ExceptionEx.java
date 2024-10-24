import java.util.Scanner;

public class ExceptionEx {
    public static void main(String[] args) {
        int[] a={3,6,0,1,2};
        /* int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a: ");
        a=sc.nextInt();
        System.out.println("Enetr b: ");
        b=sc.nextInt(); */
        try {
            a[5]=a[0]/a[3];
            //c=a/b;
            //System.out.println("c= "+c);
            
        } catch (ArithmeticException e) {
            e.printStackTrace();
            // TODO: handle exception
            //e.printStackTrace();
            //System.out.println("Arithmatic error"+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        //System.out.println("End of code.");
    }
    
}
