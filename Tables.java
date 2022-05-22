import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,b,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<=b;i++)
        {
            if(i%2==1)
            System.out.println(a+" x "+i+" = "+a*i);
        }
    }
}