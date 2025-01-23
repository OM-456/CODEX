import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1 ,a1,palindrome=0,rem;
        System.out.println("Enter any number:");
        n1=sc.nextInt();
        a1=n1;
        while (n1>0) {
            rem=n1%10;
         palindrome= palindrome*10+rem; 
         n1=n1/10; 
        }
        if(a1==palindrome){
            System.out.println("Number is palindrome");
        }
        else
        System.out.println("Number is not palindrome");
    }
}
