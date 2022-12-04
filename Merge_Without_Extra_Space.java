import java.util.*;
class arjun{
    public static void main(String ram[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int x=0;x<t;x++){
            ArrayList<Integer> al1=new ArrayList<>();
            ArrayList<Integer> al2=new ArrayList<>();
            int m,n,i;
            m=sc.nextInt();
            n=sc.nextInt();
            for(i=0;i<m;i++){
                al1.add(sc.nextInt());
            }
            for(i=0;i<n;i++){
                al2.add(sc.nextInt());
            }
            al1.addAll(al2);
            Collections.sort(al1);
            for(i=0;i<al1.size();i++){
                if(i==al1.size()-1)
                System.out.println(al1.get(i));
                else
                System.out.print(al1.get(i)+" ");
            }
        }
    }
}