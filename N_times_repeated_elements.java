import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,k,i,j,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {  if(arr[i]!=-1)
          {
            int count=1;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    count++;
                    arr[j]=-1;
                }
            }
            if(count==k)
            {flag=1;
                System.out.print(arr[i]+" ");
            }
          }
        }
        if(flag==0)
          System.out.print("-1");
    }
}