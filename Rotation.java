import java.util.*;
class arjun{
    public static void main(String ram[]){
        int t,tc;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(tc=0;tc<t;tc++){
            int n,k,i;
            n=sc.nextInt();
            k=sc.nextInt();
            ArrayList<Integer> al=new ArrayList<>();
            for(i=0;i<n;i++)
                al.add(sc.nextInt());
            Collections.rotate(al,k);
            for(i=0;i<n;i++)
                if(i!=n-1)
                    System.out.print(al.get(i)+" ");
                else
                    System.out.print(al.get(i)+"
");
            
        }
    }
}