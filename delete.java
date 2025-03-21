import java.util.Scanner;
public class delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1]; 
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();  
        }
        int m=sc.nextInt();
            a[n-1]=m;
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
    }
}
