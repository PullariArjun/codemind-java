import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,ev_dig_count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {int count=0;
            while(arr[i]>0)
            {
                arr[i]=arr[i]/10;
                count++;
            }
            if(count%2==0)
            {
                ev_dig_count++;
            }
        }
        System.out.print(ev_dig_count);
    }
}