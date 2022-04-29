import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,i,sum=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=0;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.print(sum);
    }
}