import java.util.Scanner;
class arjun
{
    public void paes(int n,int arr[])
    {
        int i,j;
        for(i=0;i<n;i++)
        {int pro=1;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    continue;
                }
                pro=pro*arr[j];
            }
            System.out.print(pro+" ");
        }
    }
    public static void main(String ram[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        arjun obj=new arjun();
        obj.paes(n,arr);
    }
}