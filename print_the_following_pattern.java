import java.util.*;
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
                if(i==j || i==n || j==1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.print("
");
        }
    }
}