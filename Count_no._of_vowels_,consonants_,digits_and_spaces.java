import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        String b="AEIOUaeiou";
        char ch[]=str.toCharArray();
        int d=0,s=0,v=0,c=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(ch[i]))
            d++;
            if(ch[i]==' ')
            s++;
            if(Character.isLetter(ch[i]))
            {
                if(b.contains(ch[i]+""))
                v++;
                else
                c++;
            }
        }
        System.out.println("Vowels: "+v);
        System.out.println("Consonants: "+c);
        System.out.println("Digits: "+d);
        System.out.println("White spaces: "+s);
    }
}