import java.util.Scanner;
class FibonacciSeries
{
    public static void main(String args[])
    {
        int n,f0=0,f1=1,f2,sum=0;
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter n value:");
        n=sc.nextInt();
        while(f0<=n)
        {
            System.out.print(f0+" ");
            if(f0%2==0)
            {
                sum=sum+f0;
            }
            f2=f0+f1;
	        f0=f1;
	        f1=f2;
        }
        System.out.println();
        System.out.println("Sum of Even number is " + sum);
    }
}