import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=0;
        for(i=n-1;i>=0;i--)
        {
            sum=sum+arr[i]*(int)Math.pow(2,k);
            k++;
        }
        System.out.print(sum);
    }
}