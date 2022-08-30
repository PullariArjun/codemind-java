import java.util.Scanner;
class arjun
{
    public void Hello(int a,int b)
    {
        int i;
        for(i=1;i<=b;i++)
        {
            System.out.print(a+" ");
        }
    }
    public static void main(String ram[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun ar=new arjun();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i=i+2)
        {
            ar.Hello(arr[i],arr[i+1]);
        }
    }
}