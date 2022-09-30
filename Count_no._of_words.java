import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        char ch[]=str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]==' '||i==str.length()-1)
            count++;
        }
        System.out.print(count);
    }
}