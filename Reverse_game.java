import java.util.Scanner;
class arjun
{
    public int pali(int n)
    {
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String ram[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        arjun ar=new arjun();
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            System.out.print(ar.pali(arr[i])+" ");
        }
    }
}