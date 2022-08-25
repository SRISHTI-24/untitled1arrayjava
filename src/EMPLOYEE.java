import java.util.Objects;
import java.util.Scanner;
public class EMPLOYEE {
    int EID;
    String ENAME;
    int EMP_SAL;
    String C_NAME;

    EMPLOYEE(int EID, String ENAME, int EMP_SAL, String C_NAME) {
        this.EID = EID;
        this.ENAME = ENAME;
        this.EMP_SAL = EMP_SAL;
        this.C_NAME = C_NAME;
    }
    public static void result(EMPLOYEE at[])
    {
        int max1=Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        int ai=0, bi=0;
        for(int i=0;i<at.length;i++)
        {
            if(at[i].C_NAME.equals("A") && at[i].EMP_SAL>max1)
            {
                max1=at[i].EMP_SAL;
                ai=i;
            }
            if(at[i].C_NAME.equals("B") && at[i].EMP_SAL>max2)
            {
                max2=at[i].EMP_SAL;
                bi=i;
         
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }

}
class EMPLOYEETEST
{
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("HOW MANY OBJECTS");
        n = s.nextInt();
        EMPLOYEE a[] = new EMPLOYEE[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.println("enter credentials :- 1.COMPANYNAME 2. EMPLOYEENAME  3.EMPLOYEEID  4.EMPLOYEESALARY");
            a[i] = new EMPLOYEE(s.nextInt(),s.next(),s.nextInt(),s.next());
        }

        EMPLOYEE.result(a);
    }
}
