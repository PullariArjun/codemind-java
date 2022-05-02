import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int i,j;
        int a[]=new int[3];
        int b[]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for(j=0;j<3;j++)
        {
            b[j]=sc.nextInt();
        }
        int alice=0,bob=0;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(i==j)
                {
                    if(a[i]>b[j])
                    {
                        alice++;
                    }
                    else if(a[i]<b[j])
                    {
                        bob++;
                    }
                }
            }
        }
        System.out.print(alice+" "+bob);
    }
}