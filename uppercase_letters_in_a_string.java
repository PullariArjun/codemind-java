import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        char ch[]=str.toCharArray();
        int a=0;
        for(int i=0;i<str.length();i++)
        {
            if(65<=(int)ch[i]&&(int)ch[i]<=90)
            a++;
        }
        System.out.print(a);
    }
}