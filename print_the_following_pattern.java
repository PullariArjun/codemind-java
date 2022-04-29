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
            for(j=a;j>0;j--)
            {
                System.out.print(j+" ");
            }
            System.out.print("
");
        }
    }
}