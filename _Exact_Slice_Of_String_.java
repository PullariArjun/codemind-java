import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        char ch[]=str.toCharArray();
        for(int i=a;i<=b;i++)
        System.out.print(ch[i]);
    }
}