import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,m,i,j;
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
        for(i=0;i<n;i++)
        {int max=0;
            for(j=0;j<m;j++)
            {
                if(arr[j][i]>max)
                {
                    max=arr[j][i];
                }
            }
            System.out.print(max+"
");
        }
    }
}