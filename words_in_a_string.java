import java.util.*;
class arjun
{
    public static void main(String ram[])
    {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        char ch[]=a.toCharArray();
        int w=1;
        for(int i=0;i<a.length();i++)
        {
            if(ch[i]==' ')
            w++;
        }
        System.out.print(w);
    }
}