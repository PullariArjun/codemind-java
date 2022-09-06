import java.util.Scanner;
class arjun
{
    public void Hello(int n,int arr[])
    {
        int i,j,temp;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        System.out.print(arr[i]+" ");
    }
    public static void main(String ram[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        arjun ar=new arjun();
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        ar.Hello(n,arr);
    }
}