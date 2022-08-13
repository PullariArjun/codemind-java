import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int i=0,j=1,k=2;
        System.out.print(i+" "+j+" ");
        while(k<n)
        {
            sum=i+j;
            System.out.print(sum+" ");
            i=j;
            j=sum;
            k++;
        }
    }
}