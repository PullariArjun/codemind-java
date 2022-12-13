import java.util.Scanner;
class arjun{
    public static void main(String ram[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i,j,flag=0;
        int n=s.length();
        for(i=0;i<n;i++){
            int count=0;
            for(j=0;j<n;j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    count=1;
                    break;
                }
            }
            if(count==0){
                System.out.print(i);
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.print("-1");
    }
}