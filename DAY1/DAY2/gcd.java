import java.util.*;
public class gcd{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n1,n2,gcd=1;
        System.out.println("Enter first number:");
        n1=sc.nextInt();
        System.out.println("Enter second number:");
        n2=sc.nextInt();
        for(int i=1;i<=n1&&i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}