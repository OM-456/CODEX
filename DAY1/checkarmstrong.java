import java.util.*; 
public class checkarmstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num1=sc.nextInt();
        int rem,num2,arm=0;
        num2=num1;
        while (num1>0) {
        rem=num1%10;
        arm=(rem*rem*rem)+arm;
        num1=num1/10;
        }
        if(num2==arm){
            System.out.println("given number is armstrong");
        }
        else
        System.out.println("given number is not armstrong");

    }
}
