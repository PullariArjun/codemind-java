import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(i*(i+1)==n)
            {
                count++;
            }
        }
        if(count==1)
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}