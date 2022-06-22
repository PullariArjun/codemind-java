import java.util.Scanner;
class arjun
{
    public int obo(int n,int arr[])
    {
        int i,count=0;
        for(i=1;i<n-1;i++)
        {
            if(arr[i]%2==0&&arr[i+1]%2==0&&arr[i-1]%2==0)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String ram[])
    {
        int n,i,res;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        arjun ar=new arjun();
        res=ar.obo(n,arr);
        System.out.print(res);
    }
}