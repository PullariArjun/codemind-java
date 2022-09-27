import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,c=0,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(1<=n&&n<=30)
            sum=sum+arr[i];
            else
            c++;
        }
        if(c==0)
        System.out.print(sum);
        else
        System.out.print("Enter a Valid Number");
    }
}