import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j,min=999999,max=0;
        int x=0,y=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
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
            if(arr[i]==count&&min>arr[i])
            {
                min=arr[i];
                x++;
            }
            if(count==arr[i]&&max<arr[i])
            {
                max=arr[i];
                y++;
            }
        }
        if(x!=0&&y!=0)
        System.out.print(min+" "+max);
        else
        System.out.print("-1");
    }
}