import java.util.Scanner;
class MaxAndMin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Given array elements:");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        int max=a[0];
        int min=a[0];
        for(int i=1;i<n;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("Maximun element is "+max);
        System.out.println("Minimum element is "+min);
    }
}