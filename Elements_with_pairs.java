import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        if(n%2==1)
        System.out.print("0");
    }
}