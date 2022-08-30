import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j]&&i!=j)
                {
                    arr[j]=0;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            {
                sum=sum+arr[i];
            }
        }
        System.out.print(sum);
    }
}