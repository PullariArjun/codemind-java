import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,max,d,i,f;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        arr[i]=sc.nextInt();
        max=(int)Math.log10(arr[0])+1;
        for(i=1;i<n;i++)
        {
            f=0;
            if(arr[i]<0)
            {
                arr[i]=-1*arr[i];
                f++;
            }
            if(max<(int)Math.log10(arr[i])+1)
            max=(int)Math.log10(arr[i])+1;
            if(f==1)
            arr[i]=arr[i]*(-1);
        }
        for(i=0;i<n;i++)
        {
            f=0;
            if(arr[i]<0)
            {
                arr[i]=arr[i]*(-1);
                f++;
            }
            if((int)Math.log10(arr[i])+1==max)
            {
                if(f==1)
                {
                    arr[i]=arr[i]*(-1);
                }
                System.out.print(arr[i]+" ");
            }
        }
    }
}