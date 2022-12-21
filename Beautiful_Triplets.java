import java.util.*;
class arjun{
    public static void main(String ram[]){
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(i=0;i<n;i++)
            al.add(sc.nextInt());
        while(al.size()!=0){
            System.out.println(al.size());
            int min=Collections.min(al);
            int z=Collections.frequency(al,min);
            for(i=0;i<z;i++)
                al.remove(new Integer(min));
        }
    }
}