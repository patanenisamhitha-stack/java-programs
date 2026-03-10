class Student
{
    String name;
    int age;
    String course;
    Student()
    {
        name="Not Assigned";
        age=0;
        course="Not Assigned";
    }
    Student(String n)
    {
        name=n;
        age=0;
        course="Not Selected";
    }
    Student(String n,int a)
    {
        name=n;
        age=a;
        course="Not Selected";
    }
    Student(String n,int a,String c)
    {
        name=n;
        age=a;
        course=c;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Course:"+course);
    }
    public static void main(String[] args)
    {
        Student s1=new Student();
        Student s2=new Student("Mani");
        Student s3=new Student("Samhitha",18);
        Student s4=new Student("Mani Samhitha",17,"Java Programming");
        System.out.println("Student details created with default constructor:");
        s1.display();
        System.out.println("Student details created with parameterized constructor(String):");
        s2.display();
        System.out.println("Student details created with parameterized constructor(String,int):");
        s3.display();
        System.out.println("Student details created with parameterized constructor(String,int,String):");
        s4.display();
    }
}