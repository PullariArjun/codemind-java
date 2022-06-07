import java.util.Scanner;
class arjun
{
    public void fmp(int n,int arr[])
    {
        int i,j;
        for(i=1;i<1000;i++)
        {int count=0;
            for(j=0;j<n;j++)
            {
                if(i==arr[j])
                {
                    count++;
                }
            }
            if(count==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
    public static void main(String ram[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        arjun a=new arjun();
        a.fmp(n,arr);
    }
}