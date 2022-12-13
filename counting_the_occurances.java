import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        String s;
        int i,count=0;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        char a=sc.next().charAt(0);
        for(i=0;i<s.length();i++){
            if(a==s.charAt(i))
                count++;
        }
        if(count==0)
            System.out.print("-1");
        else
            System.out.print(count);
    }
}