import java.util.Scanner;
class arjun
{
    public double eb(int un)
    {
        double c;
        if(un<199)
        c=un*1.20;
        else if(200<=un&&un<400)
        c=un*1.50;
        else if(400<=un&&un<600)
        c=un*1.80;
        else
        c=un*2.00;
        if(c>400)
        c=c+(c*0.15);
        else
        c=c+100;
        return c;
    }
    public static void main(String ram[])
    {
        int un;
        double res;
        String id,name;
        Scanner sc=new Scanner(System.in);
        id=sc.nextLine();
        name=sc.nextLine();
        un=sc.nextInt();
        arjun a=new arjun();
        res=a.eb(un);
        System.out.format("%.2f",res);
    }
}