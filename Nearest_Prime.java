import java.util.Scanner;
class arjun
{
    public int prime(int n)
    {
        int i,count=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            count++;
        }
        return count;
    }
    public static void main(String ram[])
    {
        int n,i,j,first=0,second=0;
        Scanner sc=new Scanner(System.in);
        arjun ar=new arjun();
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            for(j=arr[i];;j++)
            {
                if(ar.prime(j)==2)
                {
                    first=j;
                    break;
                }
            }
            for(j=arr[i];j>=1;j--)
            {
                if(ar.prime(j)==2)
                {
                    second=j;
                    break;
                }
            }
            if((arr[i]-second)<=(first-arr[i]))
            System.out.print(second+"
");
            else
            System.out.print(first+"
");
        }
    }
}