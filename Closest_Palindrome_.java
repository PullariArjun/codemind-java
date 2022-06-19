import java.util.Scanner;
class arjun
{
    public void cp(int n)
    {
        int i,r,temp,sum;
        int f_p=0,s_p=0;
        /*cheking next palindrome number*/
        for(i=n+1;i<=n+10000;i++)
        {
            temp=i;
            sum=0;
            while(temp>0)
            {
                r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
            }
            if(i==sum)
            {
                 f_p=i;
                break;
            }
        }
       /* cheking before palindrome*/
        for(i=n-1;i>=1;i--)
        {
            temp=i;
            sum=0;
            while(temp>0)
            {
                r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
            }
            if(i==sum)
            {
                 s_p=i;
                break;
            }
        }
       /* printing those palindrome numbers*/
        if((f_p-n)>(n-s_p))
        System.out.print(s_p);
        else if((f_p-n)<(n-s_p))
        System.out.print(f_p);
        else
        System.out.print(s_p+" "+f_p);
    }
    public static void main(String ram[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun ar=new arjun();
        ar.cp(n);
        
    }
}