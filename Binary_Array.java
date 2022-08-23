import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,count=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==1||arr[i]==0)
            count++;
        }
        if(count==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}