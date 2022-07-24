import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,r,d,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         d=(int)Math.log10(n)+1;
        int arr[]=new int[d];
         i=0;
        while(n>0)
        {
            r=n%10;
            arr[i]=r;
            n=n/10;
            i++;
        }
        int c=0;
        for(i=0;i<arr.length;i++)
        {int count=0;
            for(j=0;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                c++;
            }
        }
        if(c==d)
        System.out.print("Unique Number");
        else
        System.out.print("Not Unique Number");
    }
}