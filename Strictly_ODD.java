import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,count1=0,count2=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==1)
            count1++;
            if(i%2==1&&arr[i]%2==1)
            count2++;
        }
        if(count1==count2)
        System.out.print("True");
        else
        System.out.print("False");
    }
}