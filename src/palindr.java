import java.util.Scanner;
class palindr {

        static public void palindrome(int a[], int n)
        {
            int f=0;
            for(int i=0;i<=n/2 && n!=0;i++)
            {
                if(a[i]!=a[n-i-1])
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
                System.out.println("Not A Palindrome");
            else
                System.out.println("Palindrome");
        }
        public static void main(String args[])
        {
            int n;
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            palindrome(a,n);
        }
}
