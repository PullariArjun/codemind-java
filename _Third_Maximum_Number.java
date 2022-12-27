import java.util.*;
class arjun{
    public static void main(String ram[]){
        int n,i,max,frq;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(i=0;i<n;i++)
            al.add(sc.nextInt());
        max=Collections.max(al);
        int k=max;
        frq=Collections.frequency(al,max);
        for(i=0;i<frq;i++)
            al.remove(new Integer(max));
        max=Collections.max(al);
        frq=Collections.frequency(al,max);
        for(i=0;i<frq;i++)
            al.remove(new Integer(max));
        if(al.isEmpty())
            System.out.print(k);
        else
            System.out.print(Collections.max(al));
    }
}