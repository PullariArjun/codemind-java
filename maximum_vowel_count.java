import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String r;
        Scanner sc=new Scanner(System.in);
        r=sc.nextLine();
        char ch[]=r.toCharArray();
        String a="aeiouAEIOU";
        int z=0,i,mv=0;
        for(i=0;i<r.length();i++)
        {
            if(a.contains(ch[i]+""))
            z++;
            if(ch[i]==' '||i==r.length()-1)
            {
                if(mv<z)
                mv=z;
                z=0;
            }
        }
        System.out.print(mv);
    }
}