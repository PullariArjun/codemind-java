import java.util.*;
class arjun{
    public static int rev(int n){
        String a=Integer.toString(n);
        String x="";
        for(int i=a.length()-1;i>=0;i--){
            x+=a.charAt(i);
        }
        n=Integer.parseInt(x);
        return n;
    }
    public static void main(String ram[]){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        n+=arjun.rev(n);
        while(n!=arjun.rev(n)){
            n+=arjun.rev(n);
        }
        System.out.print(n);
    }
}