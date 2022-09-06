import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        k=sc.nextInt();
        int j,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int c=0;
        for(i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                System.out.print(i+" ");
                c++;
                break;
            }
        }
        if(c==0)
        System.out.print("-1 ");
        
        c=0;
        for(i=n-1;i>=0;i--)
        if(arr[i]==k)
        {
            System.out.print(i+" ");
            c++;
            break;
        }
        if(c==0)
        System.out.print("-1 ");
    }
}