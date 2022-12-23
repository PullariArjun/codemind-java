import java.util.*;
class arjun{
    public static void main(String ram[]){
        int n,i,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        k=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        i=0;
        while(al.size()<n){
            al.add(arr[i]);
            if(i+k>=n)
                i=k+i+1-n;
            else
                i+=k;
        }
        for(i=0;i<n;i++)
            System.out.print(al.get(i)+" ");
    }
}