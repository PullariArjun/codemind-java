import java.util.Scanner;
class arjun
{
    public void uva(int n,int arr[])
    {
        int i,j,f=0;
        for(i=0;i<n;i++)
        {int count=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.print(arr[i]+" ");
                f++;
            }
        }
        if(f==0)
            System.out.print("-1");
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
        a.uva(n,arr);
    }
}