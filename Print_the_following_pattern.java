import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=n;i>=1;i--)
        {
            for(j=1;j<=n;j++)
            {
                if(i==j||j==(n-i)+1)
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.print("
");
        }
    }
}