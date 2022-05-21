import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            int sum=0;
            int temp=arr[i];
            while(temp>0)
            {
                a=temp%10;
                sum=sum*10+a;
                temp=temp/10;
            }
            if(sum==arr[i])
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}