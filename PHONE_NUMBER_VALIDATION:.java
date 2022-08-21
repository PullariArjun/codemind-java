import java.util.*;
class arjun
{
    public static void main(String ram[])
    {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        if(s.charAt(0)==0||s.length()!=10)
        System.out.print("Invalid");
        else
        System.out.print("Valid");
    }
}