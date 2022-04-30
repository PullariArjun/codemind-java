import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        switch(ch)
        {
            case'A':
            case'E':
            case'I':
            case'O':
            case'U':
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
                System.out.print("Vowel");
                break;
            default:
            System.out.print("Consonant");
        }
    }
}