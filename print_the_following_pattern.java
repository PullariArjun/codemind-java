import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j||j==0||j==n-1)
                System.out.print("*");
                else 
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}