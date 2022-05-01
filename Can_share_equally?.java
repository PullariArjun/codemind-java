import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        if(x%2==0&&(x!=0||y%2==0))
        System.out.print("YES");
        else
        System.out.print("NO");
    }
}