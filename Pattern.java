import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=a;j++)
            {
                System.out.print(i+" ");
            }
            System.out.print("
");
        }
    }
}