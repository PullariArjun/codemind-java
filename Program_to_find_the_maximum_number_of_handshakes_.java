import java.util.Scanner;
class mr
{
    public static void main(String arjun[])
    {
        int a,i,sum=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=0;i<a;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}