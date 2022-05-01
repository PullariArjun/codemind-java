import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,k,count=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%k!=0)
            {
                count=count+1;
            }
        }
        System.out.print(count);
    }
}