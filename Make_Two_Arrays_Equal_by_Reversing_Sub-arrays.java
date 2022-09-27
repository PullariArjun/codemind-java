import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,m,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr1[]=new int[n];
        for(i=0;i<n;i++)
        arr1[i]=sc.nextInt();
        m=sc.nextInt();
        int arr2[]=new int[m];
        for(i=0;i<m;i++)
        arr2[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int count=0;
            for(int j=0;j<m;j++)
            {
                if(arr1[i]==arr2[j])
                count++;
            }
            if(count!=0)
            c++;
        }
        if(c==n)
        System.out.print("True");
        else
        System.out.print("False");
    }
}