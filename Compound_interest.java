import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        double p,t,r;
        double a;
        Scanner sc=new Scanner(System.in);
        p=sc.nextDouble();
        r=sc.nextDouble();
        t=sc.nextDouble();
        a=(double)(p*Math.pow((1+(r/100)),t));
        System.out.format("%.2f",a);
    }
}