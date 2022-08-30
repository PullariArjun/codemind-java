import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2!=0)
            sum=sum+arr[i];
            else
            break;
        }
        System.out.print(sum);
    }
}