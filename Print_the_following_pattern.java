import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int i,j,n,k=0;
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            k++;
            for(j=1;j<=n;j++)
            {
                if(k>j)
                continue;
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}