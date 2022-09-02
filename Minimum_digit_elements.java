import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,min,i,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        min=(int)Math.log10(arr[0])+1;
        for(i=1;i<n;i++)
        {
            if(min>(int)Math.log10(arr[i])+1)
            min=(int)Math.log10(arr[i])+1;
        }
        for(i=0;i<n;i++)
        {
            if((int)Math.log10(arr[i])+1==min)
            count++;
        }
        System.out.print(count);
    }
}