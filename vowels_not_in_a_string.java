import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        char ch[]=str.toCharArray();
        int a=0,e=0,i=0,o=0,u=0;
        for(int j=0;j<str.length();j++)
        {
            if(ch[j]=='a')
            a++;
            if(ch[j]=='e')
            e++;
            if(ch[j]=='i')
            i++;
            if(ch[j]=='o')
            o++;
            if(ch[j]=='u')
            u++;
        }
        if(a==0)
        System.out.print("a ");
        if(e==0)
        System.out.print("e ");
        if(i==0)
        System.out.print("i ");
        if(o==0)
        System.out.print("o ");
        if(u==0)
        System.out.print("u ");
        if(a!=0&&e!=0&&i!=0&&o!=0&&u!=0)
        System.out.print("0");
    }
}