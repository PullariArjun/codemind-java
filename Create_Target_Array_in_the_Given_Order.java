import java.util.*;
class arjun{
    public static void main(String ram[]){
        int n,m,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        m=sc.nextInt();
        int arr1[]=new int[m];
        for(i=0;i<m;i++)
            arr1[i]=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(i=0;i<m;i++)
            al.add(arr1[i],arr[i]);
        for(i=0;i<m;i++)
            System.out.print(al.get(i)+" ");
    }
}