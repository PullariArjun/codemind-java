import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,sum=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n==sum)
        System.out.print("True");
        else
        System.out.print("False");
    }
}