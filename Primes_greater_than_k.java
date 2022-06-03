import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,k,i,j,primes_grater_k=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {int count=0;
            for(j=2;j<arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    count++;
                }
            }
            if(count==0&&arr[i]>=k)
            {
                primes_grater_k++;
            }
        }
        System.out.print(primes_grater_k);
    }
}