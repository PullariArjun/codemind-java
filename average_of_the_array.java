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
            sum=sum+arr[i];
        }
        double avg=(double)sum/n;
        System.out.format("%.2f",avg);
    }
}