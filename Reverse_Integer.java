import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,count=0,a,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
            n=(-1)*n;
            count++;
        }
        while(n>0)
        {
            a=n%10;
            sum=sum*10+a;
            n=n/10;
        }
        if(count==1)
        System.out.print((-1)*sum);
        else
        System.out.print(sum);
    }
}