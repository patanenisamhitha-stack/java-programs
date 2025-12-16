import java.util.Scanner;
class ArmstrongNumber
{
    public static void main(String args[])
    {
        int n,m,r,sum=0;
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=n;
        while(n!=0)
        {
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(m==sum)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}