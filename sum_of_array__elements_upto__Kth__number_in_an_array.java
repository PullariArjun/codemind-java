import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,k,sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i!=k;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print(sum);
    }
}