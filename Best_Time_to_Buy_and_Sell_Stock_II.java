import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,max=0,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n-1;i++)
        {
            if(arr[i+1]-arr[i]>=1)
            max=max+arr[i+1]-arr[i];
        }
        System.out.print(max);
    }
}