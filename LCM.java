import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,b,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<10000;i++)
        {
            if(i%a==0&&i%b==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}