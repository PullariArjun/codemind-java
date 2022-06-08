import java.util.Scanner;
class arjun
{
    public void cp(int n)
    {
        int count=0,i,c=0,r,sum=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        for(i=2;i<sum;i++)
        {
            if(sum%i==0)
            {
                c++;
            }
        }
        if(c==0&&count==0)
        System.out.print("circular prime");
        else if(count==0&&c!=0)
        System.out.print("prime but not a circular prime");
        else if(count!=0)
        System.out.print("not prime");
    }
    public static void main(String ram[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun obj=new arjun();
        obj.cp(n);
    }
}