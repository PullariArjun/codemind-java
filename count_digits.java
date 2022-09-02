import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==0)
            {
                System.out.print("1 ");
                continue;
            }
            if(arr[i]<0)
            {
                arr[i]=-1*arr[i];
            }
            System.out.print((int)Math.log10(arr[i])+1+" ");
        }
    }
}