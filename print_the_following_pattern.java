import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j||i==n-j+1)
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print("0");
                }
                
            }
            System.out.print("
");
        }
    }
}