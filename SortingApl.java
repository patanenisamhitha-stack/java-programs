import java.util.Scanner;
class SortingApl
{
    public static void main(String args[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting:");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("After sorting:");
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}