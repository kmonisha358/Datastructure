import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1]; 
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();   
        } 
        int m=sc.nextInt();
        for(int i=n-1;i>=0;i--) {
            a[i+1]=a[i];
        }
        a[0]=m;
        for(int i=0;i<n+1;i++) {
            System.out.print(a[i]+" ");
        }
    }
}