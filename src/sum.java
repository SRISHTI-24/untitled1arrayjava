import java.util.Scanner;
public class sum {
    public static void sum(int a[], int n)
    {
        int r=0,k=0,s=0,s1=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==6)
                r=i;
            else
                k=i;
            s=s+a[i];
        }
        for(int i=r;i<k;i++)
        {
            s1=s1+a[i];
        }
        System.out.println(s-s1);
    }

    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        sum(a,n);,
    }
}
