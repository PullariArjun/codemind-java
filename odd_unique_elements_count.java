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
        {
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j]&&i!=j&&arr[i]%2==1)
                {
                    arr[j]=0;
                }
            }
        }
        int count=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==1)
            count++;
        }
        System.out.print(count);
    }
}