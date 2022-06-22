import java.util.Scanner;
class arjun
{
    public int adn(int n,int x)
    {
        int i=0,sum1=0;
        int r,temp=n;
        int temp1=0;
        /*takeing last digits of that number*/
        while(i<x)
        {
            r=temp%10;
            sum1=sum1+r*(int)Math.pow(10,i);
            temp=temp/10;
            i++;
        }
        /*revers that number*/
        while(n>0)
        {
            r=n%10;
            temp1=temp1*10+r;
            n=n/10;
        }
        i=0;
        int sum2=0;
        /*taking first digits of that number*/
        while(i<x)
        {
            r=temp1%10;
            sum2=sum2*10+r;
            temp1=temp1/10;
            i++;
        }
        /*if second num is grater than first num
         second number-first number*/
        if(sum2>sum1)
        return sum2-sum1;
       /*else first num-second num*/
        else
        return sum1-sum2;
    }
    public static void main(String ram[])
    {
        int n,x,res;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=sc.nextInt();
        arjun ar=new arjun();
        res=ar.adn(n,x);
        System.out.print(res);
    }
}