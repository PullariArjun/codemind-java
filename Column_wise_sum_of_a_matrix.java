import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<m;i++)
        {int sum=0;
            for(j=0;j<n;j++)
            {
                sum=sum+arr[j][i];
            }
            System.out.print(sum+" ");
        }
    }
}