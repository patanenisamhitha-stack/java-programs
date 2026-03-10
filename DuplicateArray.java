import java.util.Scanner;
class DuplicateArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n=sc.nextInt();
        int newsize=0;
        int a[]=new int[n];
        int b[]=new int[n];
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
        for(int i=0;i<n;i++)
        {
            boolean isDup=false;
            for(int j=0;j<newsize;j++)
            {
                if(a[i]==b[j])
                {
                    isDup=true;
                    break;
                }
            }
            if(!isDup)
            {
                b[newsize]=a[i];
                newsize++;
            }
        }
        System.out.println("After removig duplicate elements:");
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]+" ");
        }
    }
}