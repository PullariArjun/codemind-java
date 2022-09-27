import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,m,count=0,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr1[]=new int[n];
        for(i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        m=sc.nextInt();
        int arr2[]=new int[m];
        for(i=0;i<m;i++)
        arr2[i]=sc.nextInt();
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr1[i]<=k&&k<=arr2[i])
            count++;
        }
        System.out.print(count);
    }
}