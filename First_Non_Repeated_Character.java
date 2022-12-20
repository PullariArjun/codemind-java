import java.util.*;
class arjun{
    public static void main(String ram[]){
        int t,tc;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(tc=0;tc<t;tc++){
            int n,i,flag=0;
            String s;
            n=sc.nextInt();
            s=sc.next();
            ArrayList<Character> al=new ArrayList<>();
            for(i=0;i<s.length();i++)
                al.add(s.charAt(i));
            for(i=0;i<al.size();i++){
                if(Collections.frequency(al,al.get(i))==1){
                    System.out.println(al.get(i));
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                    System.out.println("-1");
        }
    }
}