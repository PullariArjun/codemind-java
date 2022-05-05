import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=a+1;i<10000000;i++)
        {int count=0;
            for(j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {int temp=i;
             int sum=0;
                while(temp>0)
                {
                   int b=temp%10;
                    sum=sum*10+b;
                    temp=temp/10;
                }
                if(sum==i)
                {
                    System.out.print(i);
                    break;
                }
            }
        }
    }
}