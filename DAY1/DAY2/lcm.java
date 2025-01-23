import java.util.*;
public class lcm {
    public static void main(String[] args) {
        int n1,n2,lcm=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        n1=sc.nextInt();
        System.out.println("Enter second number:");
        n2=sc.nextInt();
        for(int i=1;i<=n1||i<=n2;i++){
            if(n1%i==0 && n2%i==0){
                lcm=lcm*i;
            }
        }
        System.out.println(lcm);
    }
}
