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
        int n,i,first=0,second=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun ar=new arjun();
        for(i=n;;i++)
        {
            if(ar.prime(i)==2)
            {
                first=i;
                break;
            }
        }
        for(i=n;;i--)
        {
            if(ar.prime(i)==2)
            {
                second=i;
                break;
            }
        }
        if((n-second)<=(first-n))
        System.out.print(n-second);
        else
        System.out.print(first-n);
    }
}