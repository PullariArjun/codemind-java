import java.util.*;
class Hello
{
    public static void main(String ram[])
    {
        int n,i,k,j,f=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int count=1;
            if(arr[i]==-1)
            continue;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j]&&i!=j)
                {
                    count++;
                    arr[j]=-1;
                }
            }
            if(count==k)
            {
                System.out.print(arr[i]+" ");
                f++;
            }
        }
        if(f==0)
        System.out.print("-1");
    }
}