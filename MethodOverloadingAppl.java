class MethodOverloadingAppl
{
    int add(int a,int b)
    {
        System.out.println("add(int,int) method is used");
        return a+b;
    }
    int add(int a,int b,int c)
    {
        System.out.println("add(int,int,int) method is used");
        return a+b+c;
    }
    double add(int a,double b)
    {
        System.out.println("add(int,double) method is used");
        return a+b;
    }
    double add(double a,int b)
    {
        System.out.println("add(double,int) method is used");
        return a+b;
    }
    public static void main(String[] args)
    {
        MethodOverloadingAppl m=new MethodOverloadingAppl();
        int sum1=m.add(10,20);
        System.out.println("Returned sum:"+sum1);
        int sum2=m.add(10,20,30);
        System.out.println("Returned sum:"+sum2);
        double sum3=m.add(10,20.5);
        System.out.println("Returned sum:"+sum3);
        double sum4=m.add(10.5,20);
        System.out.println("Returned sum:"+sum4);
    }
}