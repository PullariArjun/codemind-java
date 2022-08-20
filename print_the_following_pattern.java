import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int x=n+64;
        for(i=n;i>0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print((char)x+" ");
            }
            x--;
            System.out.print("
");
        }
    }
}