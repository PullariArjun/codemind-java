import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,sum=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            sum=sum+i;
        }
        if(sum>a)
        System.out.print("True");
        else
        System.out.print("False");
    }
}