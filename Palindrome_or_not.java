import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        StringBuffer s=new StringBuffer(a);
        s.reverse();
        if(a.equalsIgnoreCase(s.toString()))
        System.out.print("True");
        else
        System.out.print("False");
    }
}