import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<n/2;i++)
        {
            if(i*i==n)
            {
                count++;
            }
        }
        if(count==1)
        System.out.print("True");
        else
        System.out.print("False");
    }
}