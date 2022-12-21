import java.util.*;
class arjun{
    public static void main(String ram[]){
        int n,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(i=0;i<n;i++){
            int k;
            k=sc.nextInt();
            al.add(k*k);
        }
        Collections.sort(al);
        for(i=0;i<n;i++)
            System.out.print(al.get(i)+" ");
    }
}