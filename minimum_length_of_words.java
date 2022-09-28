import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        char ch[]=a.toCharArray();
        int mw=99999,w=0;
        for(int i=0;i<a.length();i++)
        {
            if(ch[i]!=' ')
            w++;
            if(ch[i]==' ' || i==a.length()-1)
            {
                if(mw>w)
                mw=w;
                w=0;
            }
        }
        System.out.print(mw);
    }
}