import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,k,i,count=0,first=0,last=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        for(int x=0;x<n;x++)
        {
            for(int y=x;y<n;y++)
            {
                for(int z=x;z<=y;z++)
                {
                    first=arr[x];
                    last=arr[y];
                }
                if(first==last)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}