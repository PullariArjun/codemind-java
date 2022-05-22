import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int temp=n,sum=0;
        while(n>0)
        {
            m=n%10;
            sum=sum*10+m;
            n=n/10;
        }
        if(sum==temp)
        System.out.print("True");
        else
        System.out.print("False");
    }
}