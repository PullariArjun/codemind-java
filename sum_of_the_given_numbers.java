import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(i=0;i<n;i++)
        {int sum=0;
            for(j=0;j<2;j++)
            {
                arr[i][j]=sc.nextInt();
                sum=sum+arr[i][j];
            }
            System.out.println(sum);
        }
    }
}