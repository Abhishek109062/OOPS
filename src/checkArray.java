import java.util.Scanner;

public class checkArray {
    int ar[];
    checkArray()
    {
        ar=new int[10];
        for(int x=0;x<ar.length;x++)
        {
            ar[x]=x*10;
        }
    }
    public int check(int number)
    {
        for(int a=0;a<ar.length;a++)
        {
            if(number==ar[a])
                return a;
        }
        return -1;
    }

    public static void main(String ...args)
    {
        Scanner sc=new Scanner(System.in);
        checkArray ob=new checkArray();
        System.out.println(ob.check(sc.nextInt()));
    }
}
