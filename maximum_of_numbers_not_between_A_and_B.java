import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,a,b;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        a=sc.nextInt();
        b=sc.nextInt();
        int max=0,flag=0;
        for(i=0;i<n;i++)
        {
            if((arr[i]<a||arr[i]>b)&&arr[i]>max)
            {
                max=arr[i];
                flag++;
            }
        }
        if(flag!=0)
        System.out.print(max);
        else
        System.out.print("-1");
    }
}