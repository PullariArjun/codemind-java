import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,x,r,flag=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        x=(int)Math.log10(n);
        int y=x,z=x;
        int arr[]=new int[x+1];
        int i=0,sum=0;
        while(n>0)
        {
            r=n/(int)Math.pow(10,x);
            if(r==6&&flag==0)
            {
                r=9;
                flag=1;
            }
            n=n%(int)Math.pow(10,x);
            arr[i]=r;
            x--;
            i++;
        }
        for(i=0;i<y+1;i++)
        {
            sum=sum+arr[i]*(int)Math.pow(10,z);
            z--;
        }
        System.out.print(sum);
    }
}