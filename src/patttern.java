import java.util.Scanner;
class pattern {
    static public void number(int a[],int n)
    {
       int r=0,k=0,s=0;
       for(int i=0;i<n;i++)
       {
           if(a[i]==6)
               r=i;
           if(a[i]==7)
               k=i;
       }
       if(r<k)
       {
           for(int i=0;i<r;i++)
           {
               s=s+a[i];
           }
           for(int i=k+1;i<n;i++)
           {
               s=s+a[i];
           }
       }
       else
       {
           for(int i=0;i<n;i++)
               s=s+a[i];
       }


        System.out.println(s);
    }

    public static void main(String[] args) {
        int n;
        Scanner cs = new Scanner(System.in);
        n=cs.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=cs.nextInt();
        }
        number(a,n);
    }
}
