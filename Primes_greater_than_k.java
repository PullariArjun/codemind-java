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
        int n,k,i,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun ar=new arjun();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(ar.prime(arr[i])==2&&arr[i]>=k)
            count++;
        }
        System.out.print(count);
    }
}