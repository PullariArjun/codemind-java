import java.util.Scanner;
class arjun
{
    public void dn(int n)
    {
        int temp1=n,temp=n,count=0,r;
        double sum=0;
        while(temp1>0)
        {
            temp1=temp1/10;
            count++;
        }
        while(temp>0)
        {
            r=temp%10;
            sum=(double)(sum+Math.pow(r,count));
            temp=temp/10;
            count--;
        }
        if(sum==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
    public static void main(String ram[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun obj=new arjun();
        obj.dn(n);
    }
}