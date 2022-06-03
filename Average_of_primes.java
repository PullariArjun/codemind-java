import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int sum=0,primes=0;
        for(i=0;i<n;i++)
        {int count=0;
            if(arr[i]==1)
            {
                continue;
            }
            for(j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                }
            }
            if(count==0)
            {
                sum=sum+arr[i];
                primes++;
            }
        }
         double avg=(double)sum/primes;
         System.out.printf("%.2f",avg);
    }
}