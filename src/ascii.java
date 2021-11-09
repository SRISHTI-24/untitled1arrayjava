import java.util.Scanner;
public class ascii {
    static public void asciiname(int a[], int n)
    {
        for(int i=0;i<n;i++)
        {
            char c = (char)(a[i]);
            System.out.println(c);
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner s1 = new Scanner(System.in);
        n = s1.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s1.nextInt();
        }
        asciiname(a,n);
    }

}
