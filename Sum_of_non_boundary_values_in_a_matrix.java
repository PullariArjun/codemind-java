import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,m,i,j,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                if(i!=0&&j!=0&&i!=n-1&&j!=m-1)
                sum=sum+arr[i][j];
            }
        }
        System.out.print(sum);
    }
}