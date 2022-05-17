import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int x,y,m;
        double p;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        p=Math.pow(x,y);
        System.out.format("%.0f",p%m);
    }
}