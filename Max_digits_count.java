import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,count=0,max;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<0)
            arr[i]=-1*arr[i];
        }    
        max=(int)Math.log10(arr[0])+1;
        for(i=1;i<n;i++)
        {
            if(max<(int)Math.log10(arr[i])+1)
            max=(int)Math.log10(arr[i])+1;
        }
        for(i=0;i<n;i++)
        {
            if(max==(int)Math.log10(arr[i])+1)
            count++;
        }
        System.out.print(count);
    }
}