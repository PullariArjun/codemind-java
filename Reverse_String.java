import java.util.*;
class arjun{
    public static void main(String ram[]){
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        System.out.print(arr[i]+" ");
    }
}