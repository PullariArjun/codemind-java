import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,sum=0,a,b,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n*n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        b=sum*sum;
        sum=0;
        while(b>0)
        {
            r=b%10;
            sum=sum*10+r;
            b=b/10;
        }
        if(a==sum)
        System.out.print("True");
        else
        System.out.print("False");
    }
}