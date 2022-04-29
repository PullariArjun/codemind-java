import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=a;i>0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.print("
");
        }
    }
}