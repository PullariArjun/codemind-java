import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int l,b,w,c,area1,area2;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        area1=l*b;
        area2=(l+(2*w))*(b+(2*w));
        System.out.print((area2-area1)*c);
    }
}