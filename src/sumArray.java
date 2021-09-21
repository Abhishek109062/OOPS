import java.util.Scanner;

public class sumArray {
    int ar[];
    sumArray(int ar[])
    {
        this.ar=ar;
    }

    public int sum()
    {
        int s=0;
        for(int x=0;x<ar.length;x++)
        {
            if(ar[x]==6)
            {
                for(int y=x;y< ar.length;y++)
                {
                    if(ar[y]==7)
                        x=y+1;
                }
            }
            s+=ar[x];
        }

        return s;
    }

    public static void main(String ...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of the array");
        int size=sc.nextInt();
        int ar[]=new int[size];
        for(int x=0;x<size;x++)
            ar[x]=sc.nextInt();

        sumArray ob=new sumArray(ar);
        System.out.println(ob.sum());
    }
}
