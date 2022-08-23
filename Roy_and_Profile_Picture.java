import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int l,n,w,h,i,j;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(i=0;i<n;i++)
        {
            for(j=0;j<2;j++)
            {
                arr[i][j]=sc.nextInt();
            }
            if(arr[i][0]<l||arr[i][1]<l)
            System.out.print("UPLOAD ANOTHER
");
            else if(arr[i][0]==arr[i][1])
            System.out.print("ACCEPTED
");
            else
            System.out.print("CROP IT
");
        }
    }
}