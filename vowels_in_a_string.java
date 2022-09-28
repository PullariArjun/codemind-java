import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        char c;
        c=sc.next().charAt(0);
        char ch[]=a.toCharArray();
        int z=0;
        for(int i=0;i<a.length();i++)
        {
            if(c==ch[i])
            {
                System.out.println("True");
                System.out.print(a.indexOf(ch[i]));
                z++;
                break;
            }
        }
        if(z==0)
        System.out.print("False");
    }
}