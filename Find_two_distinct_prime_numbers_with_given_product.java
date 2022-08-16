import java.util.Scanner;
class arjun
{
    public int pr(int n)
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
        Scanner sc=new Scanner(System.in);
        arjun ar=new arjun();
        int n,i,flag=0;
        n=sc.nextInt();
        for(i=2;i<=(int)Math.sqrt(n)+1;i++)
        {
            if(n%i==0&&ar.pr(i)==2&&ar.pr(n/i)==2)
            {
            System.out.print(i+" "+n/i);
            flag=1;
            break;
            }
        }
        if(flag==0)
        System.out.print("-1");
    }
}