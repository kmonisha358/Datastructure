import java.util.Scanner;
public class pos {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] a = new int[n+1]; 
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();  
        }
        int p=sc.nextInt();
        int e=sc.nextInt();
        for(int i=n-1;i>=p-1;i--) {
            a[i+1]=a[i];
        }  
        a[p-1]=a[p];
        for(int i=0;i<n+1;i++) {
            System.out.print(a[i]+" ");
        }
    }
}

