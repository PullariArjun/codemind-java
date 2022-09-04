import java.util.Scanner;
class arjun
{
    public void tri(int n,int arr[])
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                continue;
                for(int k=0;k<n;k++)
                {
                    if(arr[i]+arr[j]==arr[k])
                    count++;
                }
            }
        }
        if(count!=0)
        System.out.println(count/2);
        else
        System.out.println("-1");
    }
    public static void main(String ram[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        arjun ar=new arjun();
        t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            int n;
            n=sc.nextInt();
            int arr[]=new int[n];
            for(int j=0;j<n;j++)
            {
                arr[j]=sc.nextInt();
            }
            ar.tri(n,arr);
        }
    }
}