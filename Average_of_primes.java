import java.util.Scanner;
class arjun
{
    public int prime(int n)
    {
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String ram[])
    {
        int n,i,count=0,sum=0;
        arjun ar=new arjun();
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(ar.prime(arr[i])==2)
            {
                sum=sum+arr[i];
                count++;
            }
        }
        System.out.format("%.2f",(float)sum/count);
    }
}