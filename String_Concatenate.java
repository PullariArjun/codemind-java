import java.util.Scanner;
import java.util.Arrays;
class arjun
{
    public static void main(String ram[])
    {
        String a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextLine();
        b=sc.nextLine();
        String c=a+b;
        char arr[]=c.toCharArray();
        Arrays.sort(arr);
        for(int i=0;i<c.length();i++)
        System.out.print(arr[i]);
    }
}