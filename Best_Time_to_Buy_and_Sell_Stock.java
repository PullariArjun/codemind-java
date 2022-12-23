import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        int n,i,j,min=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                if(arr[j]-arr[i]>min)
                    min=arr[j]-arr[i];
            }
        }
        System.out.print(min);
    }
}