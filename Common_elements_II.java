import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,m,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[m];
        for(i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        for(i=0;i<m;i++)
        arr2[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr1[i]==-1)
            continue;
            for(j=0;j<n;j++)
            {
                if(arr1[i]==arr1[j]&&i!=j)
                arr1[j]=-1;
            }
        }
        for(i=0;i<m;i++)
        {
            if(arr2[i]==-1)
            continue;
            for(j=0;j<m;j++)
            {
                if(arr2[i]==arr2[j]&&i!=j)
                arr2[j]=-1;
            }
        }
        for(i=0;i<n;i++)
        {int c=0;
            if(arr1[i]==-1)
            continue;
            for(j=0;j<m;j++)
            {
                if(arr1[i]==arr2[j])
                c++;
            }
            if(c==0)
            System.out.print(arr1[i]+" ");
        }
        for(i=0;i<m;i++)
        {   int c=0;
            if(arr2[i]==-1)
            continue;
            for(j=0;j<n;j++)
            {
                if(arr2[i]==arr1[j])
                c++;
            }
            if(c==0)
            System.out.print(arr2[i]+" ");
        }
    }
}