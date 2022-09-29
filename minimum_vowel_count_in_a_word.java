import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        String b="AEIOUaeiou";
        int z=0,mv=999,i;
        char ch[]=a.toCharArray();
        for(i=0;i<a.length();i++)
        {
            if(b.contains(ch[i]+""))
            z++;
            if(ch[i]==' '||i==a.length()-1)
            {
                if(mv>z)
                mv=z;
                z=0;
            }
        }
        System.out.print(mv);
    }
}