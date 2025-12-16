import java.util.Scanner;
class ReadInput
{
  public static void main(String args[])
  {
    int num1,num2,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first number:");
    num1=sc.nextInt();
    System.out.print("Enter second number:");
    num2=sc.nextInt();
    sum=num1+num2;
    System.out.println("The sum is " + sum);
  }
}