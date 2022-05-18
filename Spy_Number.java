import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,a,sum=0,pro=1;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            a=n%10;
            sum=sum+a;
            pro=pro*a;
            n=n/10;
        }
        if(sum==pro)
        System.out.print("Spy Number");
        else
        System.out.print("Not Spy Number");
    }
}