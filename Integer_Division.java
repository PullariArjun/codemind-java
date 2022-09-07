import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        long n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        if(n<0)
        {
            if(n%10==0)
            System.out.print(n/10);
            else
            System.out.print(n/10-1);
        }
        else
        System.out.print(n/10);
    }
}