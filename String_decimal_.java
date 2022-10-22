import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int z=0;z<t;z++)
        {
            String str;
            str=sc.next();
            int flag=0,i;
            for(i=0;i<=str.length()-1;i++)
            {
                if(Character.isDigit(str.charAt(i)))
                flag++;
            }
            if(flag==str.length())
            System.out.println("True");
            else
            System.out.println("False");
        }
    }
}