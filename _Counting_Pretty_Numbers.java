import java.util.Scanner;
class arjun
{
    public void cpn(int n,int arr[][])
    {
        int i,j;
        for(i=0;i<n;i++)
        {int count=0;
            for(j=arr[i][0];j<=arr[i][1];j++)
            {
                /*if the last num of the num is
                2 or 3 or 9 then incriment count*/
                if(j%10==2||j%10==3||j%10==9)
                count++;
            }
            System.out.println(count);
        }
    }
    public static void main(String ram[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(i=0;i<n;i++)
        {
            for(j=0;j<2;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        arjun ar=new arjun();
        ar.cpn(n,arr);
    }
}