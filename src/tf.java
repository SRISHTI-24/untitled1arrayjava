import java.util.Scanner;
public class tf {
    static public void tfcheck(int a[], int n)
    {
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=1 && a[i]!=4)
            {
                f=1;
                System.out.println("False");
                break;
            }
        }
        if(f==0)
            System.out.println("True");
    }

    public static void main(String[] args) {
        int n;
        Scanner d = new Scanner(System.in);
        n = d.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= d.nextInt();
        }
        tfcheck(a,n);


    }
}
