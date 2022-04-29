import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        float a,i,sum=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        for(i=1;i<=a;i++)
        {
            sum=sum+(1/i);
        }
        System.out.format("%.2f",sum);
    }
}