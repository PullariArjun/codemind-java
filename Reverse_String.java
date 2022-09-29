import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        StringBuffer s=new StringBuffer(str);
        System.out.print(s.reverse());
    }
}