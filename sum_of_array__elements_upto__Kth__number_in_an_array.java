import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,k,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]!=k)
            sum=sum+arr[i];
            else
            break;
        }
        System.out.print(sum+k);
    }
}