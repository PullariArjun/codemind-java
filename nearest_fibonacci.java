import java.util.Scanner;
class arjun
{
    public int fab(int n)
    {
        int i=0,j=1,sum=0,flag=0;
        while(sum<n)
        {
            sum=i+j;
            i=j;
            j=sum;
            if(sum==n)
            flag=1;
        }
        return flag;
    }
    public static void main(String ram[])
    {
        int n,i,first=0,second=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun ar=new arjun();
        for(i=n;i<=3*n;i++)
        {
            if(ar.fab(i)!=0)
            {
                first=i;
                break;
            }
        }
        for(i=n;i>=1;i--)
        {
            if(ar.fab(i)!=0)
            {
                second=i;
                break;
            }
        }
        if((first-n)>(n-second))
        System.out.print(second);
        else if((first-n)==(n-second))
        System.out.print(second+" "+first);
        else
        System.out.print(first);
    }
}