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
            if(ch[i]!=' ')
            a++;
        }
        System.out.print(a);
    }
}