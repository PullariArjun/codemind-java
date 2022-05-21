import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,a,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            a=n%10;
            sum=sum*10+a;
            n=n/10;
        }
        System.out.print(sum);
    }
}