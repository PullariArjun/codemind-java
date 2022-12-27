import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        int n,i,j,k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int max=arr[0];
        for(i=0;i<n;i++){
            for(j=i;j<n;j++){
                int s=0;
                for(k=i;k<=j;k++){
                    s+=arr[k];
                }
                if(s>max)
                    max=s;
            }
        }
        System.out.print(max);
    }
}