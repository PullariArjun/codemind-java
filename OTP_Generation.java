import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        int n,d,r;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        d=(int)Math.log10(n);
        while(n>0){
            r=n/(int)Math.pow(10,d);
            n=n%(int)Math.pow(10,d);
            if(r%2==1)
                System.out.print(r*r);
            d--;
        }
        
    }
}