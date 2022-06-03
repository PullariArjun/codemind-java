import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j,prime_count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]==1)
            {
                continue;
            }
            int count=0;
            for(j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                prime_count++;
            }
        }
        System.out.print(prime_count);
    }
}