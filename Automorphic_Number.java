import java.util.Scanner;
class arjun
{
    public void an(int n)
    {
        int sqr=n*n,i=0,r,sum=0;
        int numbers_in_number=0;
        int temp=n;
        //counting how many numbers that given number contain
        while(temp>0)
        {
            temp=temp/10;
            numbers_in_number++;
        }
        //seeing sqr of that number last digits 
        while(i<numbers_in_number)
        {
            r=sqr%10;
            sum=sum+r*(int)Math.pow(10,i);
            sqr=sqr/10;
            i++;
        }
        if(sum==n)
        System.out.print("Automorphic Number");
        else
        System.out.print("Not an Automorphic Number");
    }
    public static void main(String ram[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arjun obj=new arjun();
        obj.an(n);
    }
}