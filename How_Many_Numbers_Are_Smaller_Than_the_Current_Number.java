import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {int count=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
            System.out.print(count+" ");
        }
    }
}