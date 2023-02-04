import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++)
                System.out.print(" ");
            for(j=i;j>0;j--)
                System.out.print(j);
            for(j=0;j<=i;j++)
                System.out.print(j);
            System.out.println();
        }
    }
}