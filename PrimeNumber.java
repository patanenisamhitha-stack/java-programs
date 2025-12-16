import java.util.Scanner;
class PrimeNumber
{
  public static void main(String args[])
  {
    int n,i,flag=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number:");
    n=sc.nextInt();
    if(n==0 || n==1)
    {
      flag=1;
    }
    for(i=2;i<=n-1;i++)
    {
      if(n%i==0)
      {
        flag=1;
        break;
      }
    }
    if(flag==0)
    {
      System.out.println("Prime number");
    }
    else 
    {
      System.out.println("Not Prime number");
    }
  }
}