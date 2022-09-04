import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,m,i,j,max=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++)
        {int sum=0;
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                sum=sum+arr[i][j];
            }
            if(max<sum)
            max=sum;
        }
        for(i=0;i<m;i++)
        {int sum=0;
            for(j=0;j<n;j++)
            {
                sum=sum+arr[j][i];
            }
            if(max<sum)
            max=sum;
        }
        System.out.print(max);
    }
}