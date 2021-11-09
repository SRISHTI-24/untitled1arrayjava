import java.util.Scanner;
class true5false{
    static public void asciiname(int a[], int n)
    {
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=1 && a[i]!=4)
            {
                f=1;
                System.out.println("false");
                break;
            }
        }
        if(f==0)
            System.out.println("true");
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
