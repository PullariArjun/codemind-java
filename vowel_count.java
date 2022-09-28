import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String a;
        String b="AEIOUaeiou";
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        char ch[]=a.toCharArray();
        int v=0;
        for(int i=0;i<a.length();i++)
        {
            if(b.contains(ch[i]+""))
            v++;
        }
        System.out.print(v);
    }
}