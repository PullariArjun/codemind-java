import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,x=0,y=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(i<n/2)
            x=x+arr[i];
            else
            y=y+arr[i];
        }
        if(x>=y)
        {
            if((x-y)%4==0)
            System.out.print("X");
            else
            System.out.print("Y");
        }
        else
        {
            if((y-x)%4==0)
            System.out.print("X");
            else
            System.out.print("Y");
        }
    }
}