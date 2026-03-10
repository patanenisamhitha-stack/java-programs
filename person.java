import java.util.Scanner;
class Person
{
    Scanner sc=new Scanner(System.in);
    void personalDetails()
    {
        System.out.println("Enter personal details:");
        System.out.println("Name:");
        String name=sc.nextLine();
        System.out.println("Age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.println("Gender:");
        String gender=sc.nextLine();
        System.out.println("City:");
        String city=sc.nextLine();
        System.out.println("Personal Details:");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("City: "+city);
    }
    void qualificationDetails()
    {
        System.out.println("Enter qualification details:");
        System.out.println("Degree:");
        String degree=sc.nextLine();
        System.out.println("Branch:");
        String branch=sc.nextLine();
        System.out.println("University:");
        String university=sc.nextLine();
        System.out.println("Year Of Passing:");
        int year=sc.nextInt();
        System.out.println("Qualification Details:");
        System.out.println("Degree: "+degree);
        System.out.println("Branch: "+branch);
        System.out.println("University: "+university);
        System.out.println("Year: "+year);
    }
    public static void main(String[] args)
    {
        Person p=new Person();
        p.personalDetails();
        p.qualificationDetails();
    }
}