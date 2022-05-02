import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int a,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int arr[]=new int[a];
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(j=arr[0];j>0;j--)
        {int count=0;
            for(i=0;i<a;i++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                }
            }
            if(count==a)
            {
                System.out.print(j);
                break;
            }
        }
    }
}