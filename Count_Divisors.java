import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int i,r,k,j,count=0;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(j=i;j<=r;j++)
        {
            if(j%k==0)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}