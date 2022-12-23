import java.util.Scanner;
class arjun{
    public static void main(String args[]){
        int t,tc;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        for(tc=0;tc<t;tc++){
            int n,i,odd=0;
            n=sc.nextInt();
            for(i=0;i<n;i++){
                if(sc.nextInt()%2==1)
                    odd++;
            }
            System.out.println(odd/2);
        }
    }
}