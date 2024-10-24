import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n!=0){
            int r=n%10;
            int fact=1;
            for(int i=1;i<=r;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;

        }
        if(sum==temp){
            System.out.println("Strong number");
        }else{
            System.out.println("Not Strong number");
        }

    }
}
