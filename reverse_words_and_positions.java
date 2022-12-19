import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        String s;
        int i,j;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        String arr[]=s.split(" ");
        for(i=arr.length-1;i>=0;i--){
            for(j=arr[i].length()-1;j>=0;j--){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}