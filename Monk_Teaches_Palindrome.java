import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            String str;
            str=sc.next();
            StringBuffer s=new StringBuffer(str);
            s.reverse();
            String b=s.toString();
            if(b.equals(str)&& str.length()%2==0)
            System.out.print("YES EVEN
");
            else if(b.equals(str)&&str.length()%2==1)
            System.out.print("YES ODD
");
            else
            System.out.print("NO
");
        }
    }
}