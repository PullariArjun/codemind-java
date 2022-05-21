import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,max=0,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            a=n%10;
            if(max<a)
            {
                max=a;
            }
            n=n/10;
        }
        System.out.print(max);
    }
}