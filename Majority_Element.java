import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j,max=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a=n;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int count=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>a/2)
            max=arr[i];
        }
        System.out.print(max);
    }
}