import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,a,b,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=n*n;
        while(a>0)
        {
            b=a%10;
            sum=sum+b;
            a=a/10;
        }
        if(n==sum)
        System.out.print("Neon Number");
        else
        System.out.print("Not Neon Number");
    }
}