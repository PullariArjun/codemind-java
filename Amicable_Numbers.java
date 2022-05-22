import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,b,i;
        int sum1=0,sum2=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                sum1=sum1+i;
            }
        }
        for(i=1;i<=b/2;i++)
        {
            if(b%i==0)
            {
                sum2=sum2+i;
            }
        }
        if(sum1==b&&sum2==a)
        System.out.print("Amicable");
        else
        System.out.print("Not Amicable");
    }
}