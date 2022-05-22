import java.util.Scanner;
class arjun
{
    public static void main(String ram[])
    {
        int n,i,j;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            int count=0;
            arr[i]=sc.nextInt();
            for(j=0;j<arr[i];j++)
            {
                if(j*j==arr[i])
                count++;
            }
            if(count==1)
            System.out.println("True");
            else
            System.out.println("False");
        }
        
    }
}