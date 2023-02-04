import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++)
                System.out.print(" ");
            for(j=1;j<=(n*2)-(n-i)*2-1;j++)
                System.out.print(i);
            System.out.println();
        }
    }
}