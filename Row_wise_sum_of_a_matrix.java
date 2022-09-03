import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int m,n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {int sum=0;
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                sum=sum+arr[i][j];
            }
            System.out.print(sum+" ");
        }
    }
}