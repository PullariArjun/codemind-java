import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        Scanner sc=new Scanner(System.in);
        int n,k,i;
        n=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(i=k;i<n;i++)
            System.out.print(arr[i]+" ");
        for(i=0;i<k;i++)
            System.out.print(arr[i]+" ");
    }
}