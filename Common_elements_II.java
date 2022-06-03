import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int m,n,i,j;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int arr1[]=new int[m];
        int arr2[]=new int[n];
        for(i=0;i<m;i++)
        {
            arr1[i]=sc.nextInt();
        }
        for(j=0;j<n;j++)
        {
            arr2[j]=sc.nextInt();
        }
        for(i=0;i<m;i++)
        {int count=0;
            for(j=0;j<n;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    count++;
                }
            }
            if(count==0)
            System.out.print(arr1[i]+" ");
        }
        for(j=0;j<n;j++)
        {int count=0;
            for(i=0;i<m;i++)
            {
                if(arr1[i]==arr2[j])
                {
                    count++;
                }
            }
            if(count==0)
            System.out.print(arr2[j]+" ");
        }
    }
}