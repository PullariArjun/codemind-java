import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,k,i,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0&&k==1)
            {
                count++;
                continue;
            }
            if(arr[i]<0)
            arr[i]=-1*arr[i];
            if((int)Math.log10(arr[i])+1==k)
            count++;
        }
        System.out.print(count);
    }
}