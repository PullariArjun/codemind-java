import java.util.Scanner;
class arjun
{
    public void mp(int n)
    {
        int i,c=0;
        int r;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               c++;
            }
        }
        if(c==2)
        {
            int count1=(int)Math.log10(n)+1;
            int count2=0;
            while(n>0)
            {
                c=0;
                r=n%10;
                for(i=1;i<=r;i++)
                {
                    if(r%i==0)
                    {
                        c++;
                    }
                }
                if(c==2)
                {
                   count2++;
                }
                n=n/10;
            }
            if(count1==count2)
            System.out.print("Mega Prime");
            else
            System.out.print("Not Mega Prime");
        }
        else
        System.out.print("Not Mega Prime");
    }
    public static void main(String ram[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun ar=new arjun();
        ar.mp(n);
    }
}