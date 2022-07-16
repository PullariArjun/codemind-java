import java.util.Scanner;
class arjun
{
    public static void fab(int n)
    {
        int i=0,j=1,sum=0,x=0;
        System.out.print(i+" "+j+" ");
        while(x<n-2)
        {
            sum=i+j;
            i=j;
            j=sum;
            System.out.print(sum+" ");
            x++;
        }
    }
    public static void main(String ram[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun.fab(n);
    }
}