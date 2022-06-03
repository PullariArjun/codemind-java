import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,b,i,r;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            int sum=0,temp=i;
            while(temp>0)
            {
                r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
            }
            if(sum==i)
            {
                System.out.print(i+" ");
            }
        }
    }
}