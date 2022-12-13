import java.util.*;
class arjun{
    public static void main(String ram[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<s.length();i++)
            al.add(s.charAt(i));
        System.out.print(Collections.max(al));
        
    }
}