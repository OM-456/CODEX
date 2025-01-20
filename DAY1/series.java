import java.util.*;
public class series{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the term :");
        int term=sc.nextInt();
        if(term>10){
          System.out.println("Maximum Input limit is 10 ");
        }
        else{
        int a=0,b=1,c;
        for(int i=0;i<=term;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
          
        }
    }
    }
}