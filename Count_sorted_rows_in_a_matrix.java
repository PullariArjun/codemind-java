import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,m,i,j,c=0;
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
        {int count=0;
            for(j=0;j<m-1;j++)
            {
                if(arr[i][j]<arr[i][j+1])
                count++;
            }
            if(count==m-1)
            c++;
        }
        for(i=0;i<n;i++)
        {int count=0;
            for(j=0;j<m-1;j++)
            {
                if(arr[i][j]>arr[i][j+1])
                count++;
            }
            if(count==m-1)
            c++;
        }
        System.out.print(c);
    }
}