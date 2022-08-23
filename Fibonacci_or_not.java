import java.util.Scanner;
class arjun
{
    public static void fab(int n)
    {
        int i=0,j=1,sum=0,flag=0;
        while(sum<n)
        {
            sum=i+j;
            i=j;
            j=sum;
            if(sum==n)
            {
                flag=1;
            }
        }
        if(flag==1)
        System.out.print("True");
        else
        System.out.print("False");
    }
    public static void main(String ram[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun.fab(n);
    }
}