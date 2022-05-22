import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,b,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i>=1;i--)
        {
            if(a%i==0&&b%i==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}