import java.util.Scanner;
class ReadName
{
  public static void main(String args[])
  {
    String name;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter name:");
    name=sc.nextLine();
    System.out.println("Hello " + name + ", Welcome to Java Programming");
  }
}