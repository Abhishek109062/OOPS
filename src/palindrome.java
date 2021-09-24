import java.util.Scanner;

public class palindrome {
    int number;
    palindrome(int number)
    {

        this.number=number;
    }
    public boolean isPalindrome()
    {
        int s=0;
        int copy=number;
        while(copy!=0)
        {
            int rem=copy%10;
            s=s*10+rem;
            copy=copy/10;
        }

        return s==number;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        palindrome ob1=new palindrome(sc.nextInt());
        System.out.println(ob1.isPalindrome());
    }
}

