public class ExceptionEx1 {
    public static void main(String[] args) {
        int[] a={3,6,0,1,2};
        try {
            a[5]=a[0]/a[3];
            
        }
        finally{
            System.out.println("end of code...");
        }
    }
}
