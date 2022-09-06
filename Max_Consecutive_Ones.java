import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,mc=0,count=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==1)
                count++;
            if(count>mc)
                mc=count;
            if(arr[i]!=1)
                count=0;
        }
        System.out.print(mc);
    }
}