import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,m,i,j,sum1=0,sum2=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
                if(i%2==0)
                sum1=sum1+arr[i][j];
                else
                sum2=sum2+arr[i][j];
            }
        }
        System.out.print(sum1+" "+sum2);
    }
}