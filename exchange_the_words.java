import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}