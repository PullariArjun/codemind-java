import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,count=0,r,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            int temp=arr[i],sum=0;
            while(temp>0)
            {
                r=temp%10;
                sum=sum*10+r;
                temp=temp/10;
            }
            if(sum==arr[i])
            {
                count++;
            }
        }
        System.out.print(count);
    }
}