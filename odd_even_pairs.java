import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int z=1;
        for(i=0;i<n;i++)
        {
            if(arr[i]==-1)
            continue;
            if(z%2==1 && arr[i]%2==1){
                System.out.print(arr[i]+" ");
                z++;
                arr[i]=-1;
                i=0;
            }
            if(z%2==0 && arr[i]%2==0){
                System.out.print(arr[i]+" ");
                z++;
                arr[i]=-1;
                i=0;
            }
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]==-1)
            continue;
            System.out.print(arr[i]+" ");
        }
        if(n%2==1)
        System.out.print("0");
    }
}