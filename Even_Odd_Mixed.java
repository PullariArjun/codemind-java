import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,a,ev_c=0,od_c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            a=n%10;
            if(a%2==0)
            {
                ev_c++;
            }
            else
            {
                od_c++;
            }
            n=n/10;
        }
        if(ev_c!=0&&od_c==0)
        {
            System.out.print("Even");
        }
        else if(ev_c==0&&od_c!=0)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
    }
}