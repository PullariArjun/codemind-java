import java.util.*;
class arjun
{
    public static void main(String ram[])
    {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        char ch[]=a.toCharArray();
        int w=0;
        for(int i=0;i<a.length();i++)
        {
            if(ch[i]!=' ')
            w++;
            if(ch[i]==' '|| i==a.length()-1)
            {
                System.out.print(w+" ");
                w=0;
            }
        }
    }
}