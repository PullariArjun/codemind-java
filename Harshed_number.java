import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,a,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n;
        while(n>0)
        {
            a=n%10;
            sum=sum+a;
            n=n/10;
        }
        if(temp%sum==0)
        System.out.print("True");
        else
        System.out.print("False");
    }
}