import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            System.out.print(arr[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            System.out.print(arr[i]+" ");
        }
    }
}