import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
        k=n/2;
        else
        k=n/2+1;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<k;i++)
        {
            if(i==n-1-i)
            System.out.print(arr[i]+" 0");
            else
            System.out.print(arr[i]+" "+arr[n-i-1]+" ");
        }
    }
}