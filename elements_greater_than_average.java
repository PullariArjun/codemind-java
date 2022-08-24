import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,sum=0,avg=0,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        avg=sum/n;
        for(i=0;i<n;i++)
        {
            if(arr[i]>=avg)
            count++;
        }
        System.out.print(count);
    }
}