import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        int t,tc;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(tc=0;tc<t;tc++){
            int n,i,j,flag=0;
            n=sc.nextInt();
            int arr[]=new int[n];
            for(i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(i=0;i<n;i++){
                int sum1=0,sum2=0;
                for(j=i-1;j>=0;j--)
                    sum1+=arr[j];
                for(j=i+1;j<n;j++)
                    sum2+=arr[j];
                if(sum1==sum2){
                    flag=1;
                    System.out.println("YES");
                    break;
                }
            }
            if(flag==0)
                System.out.println("NO");
        }
    }
}