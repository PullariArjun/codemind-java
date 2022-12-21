import java.util.*;
import java.lang.*;
class arjun{
    public static void main(String args[]){
      int i,n,k;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      ArrayList<Integer> al=new ArrayList<>();
      for(i=0;i<n;i++)
        al.add(sc.nextInt());
      k=sc.nextInt();
      if(al.contains(k))
        System.out.print(al.indexOf(k));
      else
        System.out.print("-1");
    }    
}