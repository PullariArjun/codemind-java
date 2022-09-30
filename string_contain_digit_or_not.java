import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        char ch[]=str.toCharArray();
        int a=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(ch[i]))
            a++;
        }
        if(a!=0)
        System.out.print("Contains "+a+" digit");
        else
        System.out.print("Doesn't contain digit");
    }
}