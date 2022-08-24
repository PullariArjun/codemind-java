import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int s,t,b;
        Scanner sc=new Scanner(System.in);
        s=sc.nextInt();
        t=sc.nextInt();
        b=sc.nextInt();
        System.out.print((2*s*t*b*512)/1024+"KB");
    }
}