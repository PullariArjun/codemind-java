import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        int t,tc;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(tc=0;tc<t;tc++){
            int n,s,i,j,k,flag=0;
            n=sc.nextInt();
            s=sc.nextInt();
            int arr[]=new int[n];
            for(i=0;i<n;i++)
                arr[i]=sc.nextInt();
            for(i=0;i<n;i++){
                for(j=i;j<n;j++){
                    int sum=0;
                    for(k=i;k<=j;k++){
                        sum+=arr[k];
                    }
                    if(s==sum){
                        flag=1;
                        System.out.println((i+1)+" "+(j+1));
                        break;
                    }
                }
                if(flag==1)
                    break;
            }
            if(flag==0)
                System.out.println("-1");
        }
    }
}