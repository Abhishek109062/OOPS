import java.util.Scanner;

public class Interest {
    String gender;
    int age;
    Interest(String gender , int age)
    {
        this.gender=gender;
        this.age=age;
    }

    double profit()
    {
        if(gender.equals("Female"))
        {
            if(age>=1 && age<=58)
                return 8.2;
            else if(age>=59 && age<=100)
                return 9.2;
        }
        if(gender.equals("Male"))
        {
            if(age>=1 && age<=58)
                return 8.4;
            else if(age>=59 && age<=100)
                return 10.5;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String g=sc.nextLine();
        int a=sc.nextInt();

        Interest ob=new Interest(g,a);
        System.out.println("Interest offered : "+ob.profit());
    }
}
