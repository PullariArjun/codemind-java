import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int j=65;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=n;k++)
            {
                System.out.print((char)j+" ");
            }
            System.out.print("
");
            j++;
        }
    }
}