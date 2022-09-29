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
        int a1=0,e1=0,i1=0,o1=0,u1=0;
        for(int j=0;j<str.length();j++)
        {
            if(ch[j]=='a')
            a++;
            if(ch[j]=='A')
            a1++;
            if(ch[j]=='e')
            e++;
            if(ch[j]=='E')
            e1++;
            if(ch[j]=='i')
            i++;
            if(ch[j]=='I')
            i1++;
            if(ch[j]=='o')
            o++;
            if(ch[j]=='O')
            o1++;
            if(ch[j]=='u')
            u++;
            if(ch[j]=='U')
            u1++;
        }
        if((a!=0&&e!=0&&i!=0&&o!=0&&u!=0)||(a1!=0&&e1!=0&&i1!=0&&o1!=0&&u1!=0))
        System.out.print("True");
        else
        System.out.print("False");
    }
}