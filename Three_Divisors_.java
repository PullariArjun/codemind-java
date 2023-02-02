import java.util.Scanner;
class arjun{
    static boolean prime(int n){
        int k=(int)Math.sqrt(n);
        boolean bool=true;
        for(int i=2;i<=k;i++){
            if(n%i==0){
                bool=false;
                break;
            }
        }
        return bool;
    }
    public static void main(String ram[]){
        int n,i,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        n=(int)Math.sqrt(n);
        for(i=2;i<=n;i++){
            if(arjun.prime(i))
                count++;
        }
        System.out.print(count);
    }
}