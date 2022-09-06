import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int t,i;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(i=1;i<=t;i++)
        {
            int n,k,j;
            n=sc.nextInt();
            int arr[]=new int[n-1];
            for(k=0;k<n-1;k++)
            arr[k]=sc.nextInt();
            for(k=1;k<n+2;k++)
            {int c=0;
                for(j=0;j<n-1;j++)
                {
                  if(arr[j]==k)
                  c++;
                }
                if(c==0)
                {
                    System.out.println(k);
                    break;
                }
            }
        }
    }
}