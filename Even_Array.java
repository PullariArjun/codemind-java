import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            count++;
        }
        if(count==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}