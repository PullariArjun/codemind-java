import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int sum=0;
        char ch[]=str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(ch[i]))
            {
                sum=sum+Character.getNumericValue(ch[i]);
            }
        }
        System.out.print(sum);
    }
}