import java.util.*;
class arjun{
    public static void main(String ram[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++){
            ArrayList<Integer> al1=new ArrayList<>();
            ArrayList<Integer> al2=new ArrayList<>();
            int n=sc.nextInt();
            int k;
            for(int i=0;i<n;i++){
                k=sc.nextInt();
                al1.add(k);
                al2.add(k);
            }
            Collections.sort(al1);
            if(al1.equals(al2))
            System.out.println("0");
            else
            System.out.println(Collections.max(al1)-Collections.min(al1));
        }
        
    }
}