import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String a="AEIOUaeiou";
        String b;
        int z=0;
        Scanner sc=new Scanner(System.in);
        b=sc.nextLine();
        char ch[]=b.toCharArray();
        for(int i=0;i<b.length();i++)
        {
            if(a.contains(ch[i]+""))
            z++;
            if(ch[i]==' '||i==b.length()-1)
            {
                System.out.print(z+" ");
                z=0;
            }
        }
    }
}