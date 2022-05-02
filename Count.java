import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,ec=0,oc=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                ec++;
            }
            else
            {
                oc++;
            }
        }
        System.out.print(ec+" "+oc);
    }
}