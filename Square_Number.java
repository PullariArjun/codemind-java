import java.util.Scanner;
class arjun
{
    public int sq(int n)
    {
        int i,count=0;
        for(i=1;i<n;i++)
        {
            if(n==i*i)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String ram[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res;
        n=sc.nextInt();
        arjun obj=new arjun();
        res=obj.sq(n);
        if(res==0)
        System.out.print("False");
        else
        System.out.print("True");
    }
}