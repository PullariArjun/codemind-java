import java.util.Scanner;
class arjun
{
    public static void hi(int a,int b)
    {
        for(int i=1;i<=b;i++)
        System.out.print(a+" ");
    }
    public static void main(String ram[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i=i+2)
        {
            arr[i]=sc.nextInt();
            arr[i+1]=sc.nextInt();
            arjun.hi(arr[i],arr[i+1]);
        }
    }
}