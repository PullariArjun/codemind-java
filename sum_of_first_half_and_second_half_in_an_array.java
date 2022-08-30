import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,sum1=0,sum2=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(i<n/2)
            sum1=sum1+arr[i];
            else
            sum2=sum2+arr[i];
        }
        System.out.print(sum1+"
"+sum2);
    }
}