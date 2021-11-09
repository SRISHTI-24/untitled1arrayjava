import java.util.Scanner;
class search {
    static public void search(int a[], int n, int k)
    {
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                f=1;
                System.out.println(i);
                break;
            }
        }
        if(f==0)
            System.out.println("-1");

    }
    public static void main(String args[])
    {
        int n,k;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        k = s.nextInt();
        search(a,n,k);
    }
}
