import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,max=0,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int count=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                count++;
            }
            if(count==1 && arr[i]>max)
            {
                max=arr[i];
            }
        }
        if(max!=0)
        System.out.print(max);
        else
        System.out.print("-1");
    }
}