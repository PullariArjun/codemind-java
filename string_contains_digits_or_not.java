import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(int z=0;z<t;z++)
        {
            String str;
            str=sc.next();
            int flag=0;
            for(int i=0;i<str.length();i++)
            {
                if(Character.isDigit(str.charAt(i)))
                flag++;
            }
            if(flag==0)
            System.out.println("No");
            else
            System.out.println("Yes");
        }
    }
}