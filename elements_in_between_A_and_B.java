import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,a,b,f=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]>=a&&arr[i]<=b)
            {
                System.out.print(arr[i]+" ");
                f++;
            }
        }
        if(f==0)
        System.out.print("-1");
    }
}